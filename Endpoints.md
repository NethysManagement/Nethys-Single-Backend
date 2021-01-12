# Planned Endpoints

## User Controller
-POST: '/user/sign-in'
  - Body contains username and password to be authenticated, returns JWT if successful (200).
  - If authentication fails, returns 400 instead.
  - Will return a 'service unavailable' status code if database cannot be reached (500).
-POST: '/user/create'
  - Body contains username, password and email to be stored in the DB, returns 201 if successful.
  - If username is not unique, returns 403 and prompts for a new username. 
-UPDATE: '/user/update'
  - Body contains new password or email to be stored in the DB (200).
-DELETE: '/user/delete' 
  - Body contains the username of the account to be deleted (200).
## Character Controller
-GET: 'user/character/{id}' 
-GET: 'user/character' 
-POST: 'user/character/create
-UPDATE: 'user/character/{id}/update'
-DELETE: 'user/character/{id}/delete' 
## Class Controller
-GET: 'user/character/{id}/class'
-POST: 'user/character/{id}/set-class'
-UPDATE: 'user/character/{id}/update-class'
## Spell Controller
-GET: 'user/character/{id}/all-spells'
-GET: 'user/character/{id}/prepared-spells'
-POST: 'user/character/{id}/prepared-spells'
-UPDATE: 'user/character/{id}/prepared-spells/modify'
-POST: 'user/character/{id}/prepared-spells/cast' -- ?
