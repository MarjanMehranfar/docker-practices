# docker-practices

Author: Marjan Mehranfar
------------------------------
<h5>Run docker image (practice1):</br></br>
Default: docker run -d -p 8083:8083 image_name</br>
With listening port(argument): </br>
docker run -d -p 8083:8085 image_name port=8085</br></br>
------------------------------</br></br>
Http requests:</br></br>
GET /helloworld: return "Hello Stranger"</br>
GET /helloworld?name=Marjan MEHRANFAR: return "Hello MarjanMehranfar"</br>
GET /author: return "Marjan Mehranfar"</br></h5>
