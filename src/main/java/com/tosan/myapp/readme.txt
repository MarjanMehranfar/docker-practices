
---------------READ ME---------------
Author: Marjan Mehranfar
------------------------------
Run docker image (practice1):
Default: docker run -d -p 8083:8083 image_name
With listening port(argument): docker run -d -p 8083:8085 image_name port=8085
------------------------------
Http requests:
GET /helloworld: return "Hello Stranger"
GET /helloworld?name=Marjan MEHRANFAR: return "Hello MarjanMehranfar"
GET /author: return "Marjan Mehranfar"
