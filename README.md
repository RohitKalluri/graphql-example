Request : 

curl --location 'http://localhost:8080/getAll' \
--header 'Content-Type: text/plain' \
--data '{
    getAllPerson{
        name
        email
    }
}'

Response :
{
    "errors": [],
    "data": {
        "getAllPerson": [
            {
                "name": "First person",
                "email": "xyz@gmail.com"
            },
            {
                "name": "Second person",
                "email": "abc@gmail.com"
            }
        ]
    },
    "extensions": null,
    "dataPresent": true
}


Request :

curl --location 'http://localhost:8080/getAll' \
--header 'Content-Type: text/plain' \
--data-raw '{
    findPerson(email:"xyz@gmail.com"){
        name
        address
    }
}'

Response :

{
    "errors": [],
    "data": {
        "findPerson": {
            "name": "First person",
            "address": [
                "abcd",
                "pqrs"
            ]
        }
    },
    "extensions": null,
    "dataPresent": true
}

