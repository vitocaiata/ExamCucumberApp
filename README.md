# ExamCucumberApp

-**CREAZIONE PROGETTO**

- Creo i package `report` e `screenshot`
- Creo il package `com.caiata` in `src-main-java` dove metto tutte le classi del mio progetto
- Creo la classe `RUN`(che è il mio Main, per poter avviare il progetto)
- Creo il `package utils` in cui salvo le classi `MANAGEMENTDRIVER(classe in cui starto e stoppo il driver), UTILITY(classe in cui ho i metodi più "globali"), GLOBALPARAMETERS(in cui ho salvate tutti i miei parametri utili)`
- Creo `package steps` in cui salvo la classe `APPSTEPS` che è la classe in cui ho i metodi richiamati nel test
- Creo nel `package test-java` la classe `TESTSUITE` che posso utilizzare per startare tutti i test di un determinato tag  
- Creo nel `package test-java` il `package com.caiata` che contiene la classe `TEST_APP` dove vado a crearmi i miei test

-**PASSO AI TEST**

- Effettuo `test` per login con "admin"-"admin" e verifico vada alla pagina di benvenuto
- Effettuo `test` per login con "admin"-"admin" e verifico vada alla pagina di benvenuto e che ci sia scritto "Benvenuto admin"
- Effettuo `test` per login errata con "admin"-"" e verifico esca popup errore
- Effettuo `test` per login errata con ""-"admin" e verifico esca popup errore
- Effettuo `test` per login errata con ""-"" e verifico esca popup errore
- Effettuo `test` per la login con "user"-"user" e verifico vada alla pagina di benvenuto
- Effettuo `test` per la login con "user"-"user" e verifico vada alla pagina di benvenuto e che ci sia scritto "Benvenuto user"
- Effettuo `test` parametrizzato per aggiungere user e psw e premere button reset
- Effettuo `test` parametrizzato per la login con "admin"-"admin"
- Effettuo `test` per aggiunta di un singolo utente
- Effettuo `test` per eliminazione degli utenti
- Effettuo `test` per aggiunta di elementi multipli 
- Effettuo `test` per aggiunta di elementi multipli e verifico che l'elemento che aggiungo non esiste già, in tal caso non lo aggiungo
- Effettuo `test` per tornare indietro alla pagina di login una volta entrato
- Effettuo `test` su tasto errore e verifico se viene inserita una stringa vuota



_**VERSIONE 1.1_**
- Aggiunta classe `RunCucumberTest`
- Aggiunta classe `CucumberApp`
- Aggiunto file `app.feature`
- Aggiunto file `generate_report.js`
- Aggiunto file `package.json`
- Aggiunta directory `testreportdir`

