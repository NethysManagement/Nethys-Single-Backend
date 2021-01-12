# Planned Endpoints

## User Controller

- POST: '/user/sign-in'
  - Body contains username and password to be authenticated, returns JWT if successful (200).
  - If authentication fails, returns 400 instead.
- POST: '/user/create'
  - Body contains username, password and email to be stored in the DB, returns 201 if successful.
  - If username is not unique, returns 403 and prompts for a new username.
- UPDATE: '/user/update'
  - Body contains new password or email to be stored in the DB (200).
- DELETE: '/user/delete'
  - Body contains the username of the account to be deleted (200).
  
## Character Controller

- GET: '/character/{id}'
  - Retrieves a single character from the DB if id matches
  - Will return 404 if id is not contained in the DB
  - Will contain all spells
  - Will contain prepared spells
- GET: '/character'
  - Retrieves all characters for a given user
- POST: '/character/create
  - Stores a new character in the DB for a given user
- UPDATE: '/character/{id}/update'
  - Sends in a JSON of an updated character
  - Can update prepared spell list
- DELETE: '/character/{id}/delete'
  - Deletes a character from the DB
  
## Class Controller

- GET: '/class/{class_name}'
  - Retrieves a class

## Spell Controller

- GET: '/spell/{id}
  - MVP: get a single spell object
- POST: '/spell'
  - Store a new spell in the DB
  
## Notes

- All controllers will return a 'service unavailable' status code if database cannot be reached (500).
