const fs = require('fs');
const person = fs.readFileSync('person.json', 'utf8');
const parsedPerson = JSON.parse(person);

const db = db.getSiblingDB('Q-05');

db.Person.insertOne(parsedPerson);