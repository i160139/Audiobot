package com.justai.aimybox.assistant

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.provider.BaseColumns

object TalksContract {
    // Table contents are grouped together in an anonymous object.
    object talks : BaseColumns {
        const val TABLE_NAME = "previous_talks"
        const val COLUMN_NAME_QUESTION = "question"
        const val COLUMN_NAME_ANSWER = "answer"
        const val COLUMN_NAME_PRIORITY = "priority"
        const val COLUMN_NAME_INTENT = "intent"
    }
}

private const val SQL_CREATE_ENTRIES =
    "CREATE TABLE ${TalksContract.talks.TABLE_NAME} (" +
            "${BaseColumns._ID} INTEGER PRIMARY KEY," +
            "${TalksContract.talks.COLUMN_NAME_QUESTION} TEXT," +
            "${TalksContract.talks.COLUMN_NAME_ANSWER} TEXT," +
            "${TalksContract.talks.COLUMN_NAME_PRIORITY} TEXT,"+
            "${TalksContract.talks.COLUMN_NAME_INTENT} TEXT)"

private const val SQL_DELETE_ENTRIES = "DROP TABLE IF EXISTS ${TalksContract.talks.TABLE_NAME}"

class TalksDbHelper(context: Context) : SQLiteOpenHelper(context,
    DATABASE_NAME, null,
    DATABASE_VERSION
) {
    override fun onCreate(db: SQLiteDatabase) {
        db.execSQL(SQL_CREATE_ENTRIES)
    }
    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        // This database is only a cache for online data, so its upgrade policy is
        // to simply to discard the data and start over
        db.execSQL(SQL_DELETE_ENTRIES)
        onCreate(db)
    }
    override fun onDowngrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        onUpgrade(db, oldVersion, newVersion)
    }
    companion object {
        // If you change the database schema, you must increment the database version.
        const val DATABASE_VERSION = 1
        const val DATABASE_NAME = "Talks.db"
    }
}