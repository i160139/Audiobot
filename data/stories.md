## happy path
* greet
  - utter_greet
* mood_great
  - utter_happy

## sad path
* greet
  - utter_greet
* mood_unhappy
  - utter_cheer_up
  - utter_did_that_help
* affirm
  - utter_happy

## sad path 1
* greet
  - utter_greet
* mood_unhappy
  - utter_cheer_up
  - utter_did_that_help
* affirm
  - utter_happy
  - utter_goodbye

## sad path 2
* greet
  - utter_greet
* mood_unhappy
  - utter_cheer_up
  - utter_did_that_help
* deny
  - utter_goodbye

## say goodbye
* goodbye
  - utter_goodbye

## say greet 
* greet
  - utter_greet

## bot challenge
* bot_challenge
  - utter_iamabot

## say ask fine greet
* greet
  - utter_greet
* ask_fine
  - utter_fine_answer
* affirm
  - utter_happy

## say green house 
* global_warming
  - utter_global_answer

## say global warming affirm
* greet
  - utter_greet
* global_warming
  - utter_global_answer
  - utter_did_that_help
* affirm
  - utter_happy

## say global warming deny
* greet
  - utter_greet
* global_warming
  - utter_global_answer
  - utter_did_that_help
* deny
  - utter_goodbye

## ask fine
* ask_fine
  - utter_fine_answer

## New Story

* greet
    - utter_greet
* ask_fine
    - utter_fine_answer
* global_warming
    - utter_global_answer
* mood_unhappy
    - utter_cheer_up
    - utter_did_that_help
* deny
    - utter_goodbye
