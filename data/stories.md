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

## interactive_story_stop
* stop
    - utter_sorry_for_inconvinience
    - utter_ask_continue
* deny
    - utter_goodbye

## thankyou 
* thank_you
    - utter_welcome

## path_smalltalk_agent_age
* smalltalk_agent_age
  - utter_smalltalk_agent_age

## path_smalltalk_agent_annoying
* smalltalk_agent_annoying
  - utter_smalltalk_agent_annoying

## path_smalltalk_agent_bad
* smalltalk_agent_bad
  - utter_smalltalk_agent_bad

## path_smalltalk_agent_be_clever
* smalltalk_agent_be_clever
  - utter_smalltalk_agent_be_clever

## path_smalltalk_agent_beautiful
* smalltalk_agent_beautiful
  - utter_smalltalk_agent_beautiful

## path_smalltalk_agent_birth_date
* smalltalk_agent_birth_date
  - utter_smalltalk_agent_birth_date

## path_smalltalk_agent_boss
* smalltalk_agent_boss
  - utter_smalltalk_agent_boss

## path_smalltalk_agent_busy
* smalltalk_agent_busy
  - utter_smalltalk_agent_busy

## path_smalltalk_agent_chatbot
* smalltalk_agent_chatbot
  - utter_smalltalk_agent_chatbot

## path_smalltalk_agent_clever
* smalltalk_agent_clever
  - utter_smalltalk_agent_clever

## path_smalltalk_agent_crazy
* smalltalk_agent_crazy
  - utter_smalltalk_agent_crazy

## path_smalltalk_agent_fired
* smalltalk_agent_fired
  - utter_smalltalk_agent_fired

## path_smalltalk_agent_funny
* smalltalk_agent_funny
  - utter_smalltalk_agent_funny

# path_smalltalk_agent_hungry
* smalltalk_agent_hungry
  - utter_smalltalk_agent_hungry

## path_smalltalk_agent_marry_user
* smalltalk_agent_marry_user
  - utter_smalltalk_agent_marry_user

## path_smalltalk_agent_my_friend
* smalltalk_agent_my_friend
  - utter_smalltalk_agent_my_friend

## path_smalltalk_agent_residence
* smalltalk_agent_residence
  - utter_smalltalk_agent_residence

## path_smalltalk_agent_talk_to_me
* smalltalk_agent_talk_to_me
  - utter_smalltalk_agent_talk_to_me

## path_smalltalk_agent_there
* smalltalk_agent_there
  - utter_smalltalk_agent_there

## path_smalltalk_dialog_hold_on
* smalltalk_dialog_hold_on
  - utter_smalltalk_dialog_hold_on

## path_smalltalk_dialog_hug
* smalltalk_dialog_hug
  - utter_smalltalk_dialog_hug

## path_smalltalk_dialog_sorry
* smalltalk_dialog_sorry
  - utter_smalltalk_dialog_sorry

## path_smalltalk_emotions_ha_ha
* smalltalk_emotions_ha_ha
  - utter_smalltalk_emotions_ha_ha

## path_smalltalk_emotions_wow
* smalltalk_emotions_wow
  - utter_smalltalk_emotions_wow

## path_smalltalk_greetings_goodmorning
* smalltalk_greetings_goodmorning
  - utter_smalltalk_greetings_goodmorning

## path_smalltalk_greetings_goodnight
* smalltalk_greetings_goodnight
  - utter_smalltalk_greetings_goodnight

## path_smalltalk_user_angry
* smalltalk_user_angry
  - utter_smalltalk_user_angry

## path_smalltalk_user_bored
* smalltalk_user_bored
  - utter_smalltalk_user_bored

## path_smalltalk_user_busy
* smalltalk_user_busy
  - utter_smalltalk_user_busy

## path_smalltalk_user_can_not_sleep
* smalltalk_user_can_not_sleep
  - utter_smalltalk_user_can_not_sleep

## path_smalltalk_user_does_not_want_to_talk
* smalltalk_user_does_not_want_to_talk
  - utter_smalltalk_user_does_not_want_to_talk

## path_smalltalk_user_going_to_bed
* smalltalk_user_going_to_bed
  - utter_smalltalk_user_going_to_bed

## path_smalltalk_user_has_birthday
* smalltalk_user_has_birthday
  - utter_smalltalk_user_has_birthday

## path_smalltalk_user_joking
* smalltalk_user_joking
  - utter_smalltalk_user_joking

## path_smalltalk_user_lonely
* smalltalk_user_lonely
  - utter_smalltalk_user_lonely

## path_smalltalk_user_looks_like
* smalltalk_user_looks_like
  - utter_smalltalk_user_looks_like

## path_smalltalk_user_misses_agent
* smalltalk_user_misses_agent
  - utter_smalltalk_user_misses_agent

## path_smalltalk_user_sleepy
* smalltalk_user_sleepy
  - utter_smalltalk_user_sleepy