# Spring PetClinic Sample Application using spring-graphql

This is a fork of the [Spring Pet Clinic Sample Application
for Spring-GraphQL](https://github.com/spring-petclinic/spring-petclinic-graphql).
It contains the source code for [my](https://nilshartmann.net) articles and my [short introduction video on DataLoaders](https://youtu.be/wgPAQ0K2e5Y).

Compared to the original example, this one uses a Microservice
in the backend to retrieve data.

If you want to start the application, as described below,
please also start the `VetService` microservice:

```bash
# Open terminal in root-directory:
./mvnw spring-boot:run -pl vet-service

# Open second terminal in root-directory:
./mvnw spring-boot:run -pl backend
```

* You can now open the `GraphiQL` explorer on `http://localhost:9977`. 
* For more information about GraphiQL and its usage, see below in the original README.

If you want to start the React frontend, use npm:
```bash
cd frontend

# Install dependencies
npm install

# start frontend
npm start
```

* The frontend runs on `http://localhost:3000`
* For more information about the frontend, see below in original README.

# Original README

For **example GraphQL queries** an more, please see the [original README](https://github.com/spring-petclinic/spring-petclinic-graphql/blob/main/readme.md).


## Support and Consulting for GraphQL

If you need consulting, training or other support for GraphQL, please feel free to contact me:
* [Homepage](https://nilshartmann.net/graphql)
* [Twitter](https://twitter.com/nilshartmann)

