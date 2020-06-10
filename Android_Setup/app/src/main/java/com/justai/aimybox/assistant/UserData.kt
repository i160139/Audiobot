package com.justai.aimybox.assistant

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.provider.BaseColumns
import android.service.autofill.UserData

object UserDataContract {
    // Table contents are grouped together in an anonymous object.
    object UserData : BaseColumns {
        const val TABLE_NAME = "UserData"
        const val COLUMN_NAME_LOCATION = "location"
        const val COLUMN_NAME_FRIENDS = "Friends"
    }
}

private const val SQL_CREATE_ENTRIES =
    "CREATE TABLE ${UserDataContract.UserData.TABLE_NAME} (" +
            "${BaseColumns._ID} INTEGER PRIMARY KEY," +
            "${UserDataContract.UserData.COLUMN_NAME_LOCATION} TEXT," +
            "${UserDataContract.UserData.COLUMN_NAME_FRIENDS} TEXT)"

private const val SQL_DELETE_ENTRIES = "DROP TABLE IF EXISTS ${UserDataContract.UserData.TABLE_NAME}"

    class UserDataDbHelper(context: Context) :
        SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {
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
            const val DATABASE_NAME = "UserData.db"
        }
    }