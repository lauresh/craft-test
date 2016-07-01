Tests task:

It involves simple UI, database and 3rd party Restful service.
It shows a web page with the following:
 - post id (number only)
 - submit button
 - a list with all previous successfull results from db
After submitting the form, the post id goes to server via REST.
Then the server sends a request to 3rd party service:
http://jsonplaceholder.typicode.com/posts/{post id}
Then the server saves successful response to db. Responses are then displayed.
Please demonstrate usage of JPA, Hibernate, Spring and Sptring Web MVC, Jersey.
Also please create some unit tests.
