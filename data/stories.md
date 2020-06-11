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

## path_smalltalk_agent_hungry
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

## New Story

* greet
    - utter_greet
* mood_unhappy
    - utter_cheer_up
    - utter_did_that_help
* affirm
    - utter_happy
    - utter_goodbye

## New Story

* greet
    - utter_greet
* ask_fine
    - utter_glad_fine
* mood_unhappy
    - utter_cheer_up
    - utter_did_that_help
* deny
    - utter_goodbye

## interactive_story_33
* greet
    - utter_greet
* weatherInformation{"location": "berlin"}
    - slot{"location": "berlin"}
    - weather_information_form
    - weather_information_form
* weatherInformation
    - utter_ask_location
* weatherInformation{"location": "Rawalpindi"}
    - slot{"location": "Rawalpindi"}
    - weather_information_form
    - form{"name": "weather_information_form"}
    - slot{"location": "Rawalpindi"}
    - slot{"location": "Rawalpindi"}
    - form{"name": null}
    - slot{"requested_slot": null}


## interactive_story_222
* greet
    - utter_greet
* informRestaurant
  -  restaurant_form
  -  form{"name": "restaurant_form"}
  -  slot{"requested_slot": "hotel_info"}

* informRestaurant{"hotel_info": "hotels of karachi"}
    - slot{"hotel_info": "hotels of karachi"}
    - restaurant_form
* informRestaurant{"hotel_info": "thai food restaurants"}
    - slot{"hotel_info": "thai food restaurants"}
    - restaurant_form
* informRestaurant{"hotel_info": "chinese restaurant in rawalpindi"}
    - slot{"hotel_info": "chinese restaurant in rawalpindi"}
    - restaurant_form
* informRestaurant{"hotel_info": "hotels in rawalpindi"}
    - slot{"hotel_info": "hotels in rawalpindi"}
    - restaurant_form
* informRestaurant
    - restaurant_form
* informRestaurant{"hotel_info": "five star gotel in karachi"}
    - slot{"hotel_info": "five star gotel in karachi"}
    - restaurant_form


## interactive_story_22
* greet
    - utter_greet
* informRestaurant{"hotel_info": "malls in lahore"}
    - slot{"hotel_info": "malls in lahore"}
    - restaurant_form
    - restaurant_form
    - form{"name": "restaurant_form"}
    - slot{"hotel_info": "malls in lahore"}
    - form{"name": null}
    - slot{"requested_slot": null}
* informRestaurant
    - utter_ask_hotel_info
* informRestaurant
* informRestaurant{"hotel_info": "shopping malls near my location"}
    - slot{"hotel_info": "shopping malls near my location"}
    - restaurant_form
    - form{"name": "restaurant_form"}
    - slot{"hotel_info": "shopping malls near my location"}
    - slot{"hotel_info": "shopping malls in lahore"}
    - form{"name": null}
    - slot{"requested_slot": null}
* informRestaurant
    - restaurant_form
    - form{"name": "restaurant_form"}
    - slot{"hotel_info": "shopping malls near my location"}
    - form{"name": null}
    - slot{"requested_slot": null}
* informRestaurant
    - restaurant_form
    - form{"name": "restaurant_form"}
    - slot{"hotel_info": "shopping malls near my location"}
    - form{"name": null}
    - slot{"requested_slot": null}
* informRestaurant{"hotel_info": "lahore places"}
    - slot{"hotel_info": "lahore places"}
    - restaurant_form
    - form{"name": "restaurant_form"}
    - slot{"hotel_info": "lahore places"}
    - slot{"hotel_info": "lahore places"}
    - form{"name": null}
    - slot{"requested_slot": null}
* informRestaurant{"hotel_info": "shopping malls near my location"}
    - slot{"hotel_info": "shopping malls near my location"}
    - restaurant_form
    - form{"name": "restaurant_form"}
    - slot{"hotel_info": "shopping malls near my location"}
    - slot{"hotel_info": "shopping malls near my location"}
    - form{"name": null}
    - slot{"requested_slot": null}
* informRestaurant{"hotel_info": "shopping malls in islamabad"}
    - slot{"hotel_info": "shopping malls in islamabad"}
    - restaurant_form
    - form{"name": "restaurant_form"}
    - slot{"hotel_info": "shopping malls in islamabad"}
    - slot{"hotel_info": "shopping malls in islamabad"}
    - form{"name": null}
    - slot{"requested_slot": null}
* informRestaurant
    - restaurant_form
    - form{"name": "restaurant_form"}
    - slot{"hotel_info": "shopping malls in islamabad"}
    - form{"name": null}
    - slot{"requested_slot": null}
* informRestaurant{"hotel_info": "malls in karachi"}
    - slot{"hotel_info": "malls in karachi"}
    - restaurant_form
    - form{"name": "restaurant_form"}
    - slot{"hotel_info": "malls in karachi"}
    - slot{"hotel_info": "malls in karachi"}
    - form{"name": null}
    - slot{"requested_slot": null}
* informRestaurant{"hotel_info": "places in lahore"}
    - slot{"hotel_info": "places in lahore"}
    - restaurant_form
    - form{"name": "restaurant_form"}
    - slot{"hotel_info": "places in lahore"}
    - slot{"hotel_info": "places in lahore"}
    - form{"name": null}
    - slot{"requested_slot": null}
* informRestaurant{"hotel_info": "in karachi"}
    - slot{"hotel_info": "places in karachi"}

## interactive_story_111
* greet
    - utter_greet
* weatherInformation
    - utter_ask_location
* weatherInformation{"location": "rawalpindi"}
    - slot{"location": "rawalpindi"}
    - weather_information_form
    - form{"name": "weather_information_form"}
    - slot{"location": "rawalpindi"}
    - slot{"location": "rawalpindi"}
    - form{"name": null}
    - slot{"requested_slot": null}
* weatherInformation
    - utter_ask_location
* weatherInformation{"location": "islamabad"}
    - slot{"location": "islamabad"}
    - weather_information_form
    - form{"name": "weather_information_form"}
    - slot{"location": "islamabad"}
    - slot{"location": "islamabad"}
    - form{"name": null}
    - slot{"requested_slot": null}
* weatherInformation{"location": "paris"}
    - slot{"location": "paris"}
    - weather_information_form
    - form{"name": "weather_information_form"}
    - slot{"location": "paris"}
    - slot{"location": "paris"}
    - form{"name": null}
    - slot{"requested_slot": null}
* weatherInformation
    - utter_ask_location
* weatherInformation
* weatherInformation
    - utter_ask_location
* weatherInformation{"location": "rawlpindi"}
    - slot{"location": "rawlpindi"}
    - weather_information_form
* informRestaurant{"hotel_info": "shopping malls near my loaction"}
    - slot{"hotel_info": "shopping malls near my loaction"}
    - restaurant_form
* informRestaurant{"hotel_info": "shopping malls in islamabad"}
    - slot{"hotel_info": "shopping malls in islamabad"}
    - restaurant_form
    - action_restaurant
* informRestaurant
    - utter_ask_hotel_info
* informRestaurant{"hotel_info": "shopping malls in karachi"}
    - slot{"hotel_info": "shopping malls in karachi"}
    - restaurant_form
    - form{"name": "restaurant_form"}
    - slot{"hotel_info": "shopping malls in karachi"}
    - slot{"hotel_info": "shopping malls in karachi"}
    - form{"name": null}
    - slot{"requested_slot": null}
* informRestaurant{"hotel_info": "shopping malls near my location"}
    - slot{"hotel_info": "shopping malls near my location"}
    - restaurant_form
    - form{"name": "restaurant_form"}
    - slot{"hotel_info": "shopping malls near my location"}
    - slot{"hotel_info": "shopping malls near my location"}
    - form{"name": null}
    - slot{"requested_slot": null}
* informRestaurant{"hotel_info": "shopping malls"}
    - slot{"hotel_info": "shopping malls"}
    - restaurant_form
    - form{"name": "restaurant_form"}
    - slot{"hotel_info": "shopping malls"}
    - slot{"hotel_info": "shopping malls"}
    - form{"name": null}
    - slot{"requested_slot": null}
* informRestaurant{"hotel_info": "shopping malls in delhi"}
    - slot{"hotel_info": "shopping malls in delhi"}
    - restaurant_form
    - form{"name": "restaurant_form"}
    - slot{"hotel_info": "shopping malls in delhi"}
    - slot{"hotel_info": "shopping malls in delhi"}
    - form{"name": null}
    - slot{"requested_slot": null}
* informRestaurant
    - action_restaurant
* informRestaurant
* informRestaurant
* informRestaurant{"hotel_info": "shopping malls in karachi"}
    - slot{"hotel_info": "shopping malls in karachi"}
    - restaurant_form
    - form{"name": "restaurant_form"}
    - slot{"hotel_info": "shopping malls in karachi"}
    - slot{"hotel_info": "shopping malls in karachi"}
    - form{"name": null}
    - slot{"requested_slot": null}
* informRestaurant{"hotel_info": "shopping malls in paris"}
    - slot{"hotel_info": "shopping malls in paris"}
    - restaurant_form
* informRestaurant{"hotel_info": "shopping malls"}
    - slot{"hotel_info": "shopping malls"}
    - restaurant_form
    - restaurant_form
    - form{"name": "restaurant_form"}
    - slot{"hotel_info": "shopping malls"}
    - form{"name": null}
    - slot{"requested_slot": null}
* informRestaurant{"hotel_info": "shopping malls in paris"}
    - slot{"hotel_info": "shopping malls in paris"}
    - restaurant_form
    - form{"name": "restaurant_form"}
    - slot{"hotel_info": "shopping malls in paris"}
    - slot{"hotel_info": "shopping malls in paris"}
    - form{"name": null}
    - slot{"requested_slot": null}
* informRestaurant{"location": "paris", "hotel_info": "shopping malls in paris"}
    - slot{"hotel_info": "shopping malls in paris"}
    - slot{"location": "paris"}
    - restaurant_form
    - form{"name": "restaurant_form"}
    - slot{"hotel_info": "shopping malls in paris"}
    - slot{"hotel_info": "shopping malls in paris"}
    - form{"name": null}
    - slot{"requested_slot": null}
* informRestaurant{"hotel_info": "lahore defence malls"}
    - slot{"hotel_info": "lahore defence malls"}
    - restaurant_form
    - form{"name": "restaurant_form"}
    - slot{"hotel_info": "lahore defence malls"}
    - slot{"hotel_info": "lahore defence malls"}
    - form{"name": null}
    - slot{"requested_slot": null}
* informRestaurant
    - restaurant_form
    - form{"name": "restaurant_form"}
    - slot{"hotel_info": "lahore defence malls"}
    - form{"name": null}
    - slot{"requested_slot": null}
* informRestaurant{"location": "newphew", "hotel_info": "malls in karachi"}
    - slot{"hotel_info": "malls in karachi"}
    - slot{"location": "newphew"}
    - restaurant_form
    - form{"name": "restaurant_form"}
    - slot{"hotel_info": "malls in karachi"}
    - slot{"hotel_info": "malls in karachi"}
    - form{"name": null}
    - slot{"requested_slot": null}
* informRestaurant
    - restaurant_form
    - form{"name": "restaurant_form"}
    - slot{"hotel_info": "malls in karachi"}
    - form{"name": null}
    - slot{"requested_slot": null}
* informRestaurant{"hotel_info": "malls in rawalpindi"}
    - slot{"hotel_info": "parks in lahore"}

* informRestaurant{"hotel_info": "shopping malls in paris"}
    - slot{"hotel_info": "places in lahore"}
    - restaurant_form
    - form{"name": "restaurant_form"}
    - slot{"hotel_info": "places in karachi"}
    - slot{"hotel_info": "shopping malls in paris"}
    - form{"name": null}
    - slot{"requested_slot": null}
* informRestaurant{"location": "paris", "hotel_info": "places"}
    - slot{"hotel_info": "honeymoon places"}
    - restaurant_form
    - form{"name": "restaurant_form"}
    - slot{"hotel_info": "places in karachi"}
    - slot{"hotel_info": "beach"}
    - form{"name": null}
    - slot{"requested_slot": null}
* informRestaurant{"hotel_info": "honey moon places"}
    - slot{"hotel_info": "beach"}
    - restaurant_form
    - form{"name": "restaurant_form"}
    - slot{"hotel_info": "places in dubai"}
    - slot{"hotel_info": "places in saudi arabia"}
    - form{"name": null}
    - slot{"requested_slot": null}
* informRestaurant
    - restaurant_form
    - form{"name": "restaurant_form"}
    - slot{"hotel_info": "places in dubai"}
    - form{"name": null}
    - slot{"requested_slot": null}
* informRestaurant
    - slot{"hotel_info": "malls in rawalpindi"}
    - slot{"location": "newphew"}
    - restaurant_form
    - form{"name": "restaurant_form"}
    - slot{"hotel_info": "beach"}
    - slot{"hotel_info": "parks in new york"}
    - form{"name": null}
    - slot{"requested_slot": null}
* informRestaurant
    - restaurant_form
    - form{"name": "restaurant_form"}
    - slot{"hotel_info": "parks in canada"}
    - form{"name": null}
    - slot{"requested_slot": null}
* informRestaurant{"hotel_info": "parks in karachi"}
    - slot{"hotel_info": "picnic places in karachi"}



* informRestaurant{"hotel_info": "shopping malls in islamabad"}
    - slot{"hotel_info": "places in lahore"}
    - restaurant_form
    - form{"name": "restaurant_form"}
    - slot{"hotel_info": "places in islamabad"}
    - slot{"hotel_info": "shopping malls in paris"}
    - form{"name": null}
    - slot{"requested_slot": null}
* informRestaurant{"location": "paris", "hotel_info": "places"}
    - slot{"hotel_info": "honeymoon places"}
    - restaurant_form
    - form{"name": "restaurant_form"}
    - slot{"hotel_info": "places in lahore"}
    - slot{"hotel_info": "beach"}
    - form{"name": null}
    - slot{"requested_slot": null}
* informRestaurant{"hotel_info": "honey moon places"}
    - slot{"hotel_info": "beach"}
    - restaurant_form
    - form{"name": "restaurant_form"}
    - slot{"hotel_info": "places in dubai"}
    - slot{"hotel_info": "places in saudi arabia"}
    - form{"name": null}
    - slot{"requested_slot": null}
* informRestaurant
    - restaurant_form
    - form{"name": "restaurant_form"}
    - slot{"hotel_info": "places in saudi arabia"}
    - form{"name": null}
    - slot{"requested_slot": null}
* informRestaurant
    - slot{"hotel_info": "malls in paris"}
    - slot{"location": "newphew"}
    - restaurant_form
    - form{"name": "restaurant_form"}
    - slot{"hotel_info": "beach"}
    - slot{"hotel_info": "lahore malls"}
    - form{"name": null}
    - slot{"requested_slot": null}
* informRestaurant
    - restaurant_form
    - form{"name": "restaurant_form"}
    - slot{"hotel_info": "places in canada"}
    - form{"name": null}
    - slot{"requested_slot": null}
* informRestaurant{"hotel_info": "parks in lahore"}
    - slot{"hotel_info": "picnic places in karachi"}

## interactive_story_11
* informRestaurant{"hotel_info": "parks in karachi"}
    - slot{"hotel_info": "parks in karachi"}
    - restaurant_form
    - form{"name": "restaurant_form"}
    - slot{"hotel_info": "parks in karachi"}
    - slot{"hotel_info": "parks in karachi"}
    - form{"name": null}
    - slot{"requested_slot": null}
* informRestaurant{"hotel_info": "parks in canada"}
    - slot{"hotel_info": "parks in canada"}
    - restaurant_form
    - form{"name": "restaurant_form"}
    - slot{"hotel_info": "parks in canada"}
    - slot{"hotel_info": "parks in canada"}
    - form{"name": null}
    - slot{"requested_slot": null}
* informRestaurant{"hotel_info": "shopping malls"}
    - slot{"hotel_info": "shopping malls"}
* informRestaurant{"hotel_info": "shopping places"}
    - slot{"hotel_info": "shopping places"}
    - restaurant_form
    - form{"name": "restaurant_form"}
    - slot{"hotel_info": "shopping places"}
    - slot{"hotel_info": "shopping places"}
    - form{"name": null}
    - slot{"requested_slot": null}
* informRestaurant{"hotel_info": "food restaurants"}
    - slot{"hotel_info": "food restaurants"}
    - restaurant_form
    - form{"name": "restaurant_form"}
    - slot{"hotel_info": "food restaurants"}
    - slot{"hotel_info": "food restaurants"}
    - form{"name": null}
    - slot{"requested_slot": null}
* informRestaurant{"hotel_info": "food in pakistan"}
    - slot{"hotel_info": "food in pakistan"}
* informRestaurant{"hotel_info": "it"}
    - slot{"hotel_info": "it"}
    - restaurant_form
* informRestaurant{"hotel_info": "restaurants in lahore"}
    - slot{"hotel_info": "restaurants in lahore"}
    - restaurant_form
    - form{"name": "restaurant_form"}
    - slot{"hotel_info": "restaurants in lahore"}
    - slot{"hotel_info": "restaurants in lahore"}
    - form{"name": null}
    - slot{"requested_slot": null}
* informRestaurant{"hotel_info": "restaurants in karachi"}
    - slot{"hotel_info": "restaurants in karachi"}
* informRestaurant{"hotel_info": "restaurants in karachi"}
    - slot{"hotel_info": "restaurants in karachi"}
    - restaurant_form
    - form{"name": "restaurant_form"}
    - slot{"hotel_info": "restaurants in karachi"}
    - slot{"hotel_info": "restaurants in karachi"}
    - form{"name": null}
    - slot{"requested_slot": null}
* informRestaurant
* informRestaurant{"hotel_info": "famous restaurants in mumbai"}
    - slot{"hotel_info": "famous restaurants in mumbai"}
    - restaurant_form
    - form{"name": "restaurant_form"}
    - slot{"hotel_info": "famous restaurants in mumbai"}
    - slot{"hotel_info": "famous restaurants in mumbai"}
    - form{"name": null}
    - slot{"requested_slot": null}
* informRestaurant{"hotel_info": "food in malaysia"}
    - slot{"hotel_info": "food in malaysia"}
    - restaurant_form
    - form{"name": "restaurant_form"}
    - slot{"hotel_info": "food in malaysia"}
    - slot{"hotel_info": "food in malaysia"}
    - form{"name": null}
    - slot{"requested_slot": null}
* informRestaurant{"hotel_info": "turkey dinner places"}
    - slot{"hotel_info": "turkey dinner places"}
    - restaurant_form
    - form{"name": "restaurant_form"}
    - slot{"hotel_info": "turkey dinner places"}
    - slot{"hotel_info": "turkey dinner places"}
    - form{"name": null}
    - slot{"requested_slot": null}
* informRestaurant
* informRestaurant{"hotel_info": "afghani food"}
    - slot{"hotel_info": "afghani food"}
    - restaurant_form
    - form{"name": "restaurant_form"}
    - slot{"hotel_info": "afghani food"}
    - slot{"hotel_info": "afghani food"}
    - form{"name": null}
    - slot{"requested_slot": null}
* informRestaurant{"hotel_info": "chinese food"}
    - slot{"hotel_info": "chinese food"}


* informRestaurant{"hotel_info": "restaurants in lahore"}
    - slot{"hotel_info": "restaurants in rawalpindi"}
    - restaurant_form
    - form{"name": "restaurant_form"}
    - slot{"hotel_info": "places in paris"}
    - slot{"hotel_info": "restaurants in karachi"}
    - form{"name": null}
    - slot{"requested_slot": null}
* informRestaurant{"hotel_info": "hotels in rawalpindi"}
    - slot{"hotel_info": "hotels near my location"}
* informRestaurant{"hotel_info": "restaurants in attock"}
    - slot{"hotel_info": "restaurants in pris"}
    - restaurant_form
    - form{"name": "restaurant_form"}
    - slot{"hotel_info": "Chinese restaurant"}
    - slot{"hotel_info": "desi food restaurants"}
    - form{"name": null}
    - slot{"requested_slot": null}
     - restaurant_form
* informRestaurant
* informRestaurant{"hotel_info": "famous restaurants in mumbai"}
    - slot{"hotel_info": "famous restaurants in mumbai"}
    - restaurant_form
    - form{"name": "restaurant_form"}
    - slot{"hotel_info": "famous restaurants in mumbai"}
    - slot{"hotel_info": "famous restaurants in mumbai"}
    - form{"name": null}
    - slot{"requested_slot": null}
* informRestaurant{"hotel_info": "food in malaysia"}
    - slot{"hotel_info": "food in malaysia"}
    - restaurant_form
    - form{"name": "restaurant_form"}
    - slot{"hotel_info": "food in malaysia"}
    - slot{"hotel_info": "food in malaysia"}
    - form{"name": null}
    - slot{"requested_slot": null}
* informRestaurant{"hotel_info": "turkey dinner places"}
    - slot{"hotel_info": "turkey dinner places"}
    - restaurant_form
    - form{"name": "restaurant_form"}
    - slot{"hotel_info": "restaurants near my location"}
    - slot{"hotel_info": "restaurants near my location"}
    - form{"name": null}
    - slot{"requested_slot": null}
* informRestaurant
* informRestaurant{"hotel_info": "afghani food"}
    - slot{"hotel_info": "afghani food"}
    - restaurant_form
    - form{"name": "restaurant_form"}
    - slot{"hotel_info": "afghani food"}
    - slot{"hotel_info": "afghani food"}
    - form{"name": null}
    - slot{"requested_slot": null}
* informRestaurant{"hotel_info": "asian oriental"}
    - slot{"hotel_info": "asian oriental"}
    - restaurant_form