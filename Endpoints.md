# Planned Endpoints

## User Controller
#POST: '/user/sign-in'
  - Body contains username and password to be authenticated, returns JWT if successful (200).
  - If authentication fails, returns 400 instead.
  - Will return a 'service unavailable' status code if database cannot be reached (500).
#POST: '/user/create'
  - Body contains username, password and email to be stored in the DB, returns 201 if successful.
  - If username is not unique, returns 403 and prompts for a new username. 
#UPDATE: '/user/update'
  - Body contains new password or email to be stored in the DB (200).
#DELETE: '/user/delete' 
  - Body contains the username of the account to be deleted (200).
## Character Controller
-GET: '/character/{id}' 
-GET: '/character' 
-POST: '/character/create
-UPDATE: '/character/{id}/update'
-DELETE: '/character/{id}/delete' 
## Class Controller
-GET: '/character/{id}/class'
-POST: '/character/{id}/set-class'
-UPDATE: '/character/{id}/update-class'
## Spell Controller
-GET: '/character/{id}/all-spells'
-GET: '/character/{id}/prepared-spells'
-POST: '/character/{id}/prepared-spells'
-UPDATE: '/character/{id}/prepared-spells'
-POST: '/character/{id}/cast/{spell_id}'
