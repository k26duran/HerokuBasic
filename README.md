# java-getting-started

A barebones Java app, which can easily be deployed to Heroku.

This application supports the [Getting Started with Java on Heroku](https://devcenter.heroku.com/articles/getting-started-with-java) article - check it out.

[![Deploy to Heroku](https://www.herokucdn.com/deploy/button.png)](https://heroku.com/deploy)

## Running Locally

Make sure you have Java and Maven installed.  Also, install the [Heroku CLI](https://cli.heroku.com/).

```sh
$ git clone https://github.com/heroku/java-getting-started.git
$ cd java-getting-started
$ mvn install
$ heroku local:start
```

Your app should now be running on [localhost:5000](http://localhost:5000/).

## Deploying to Heroku

```sh
$ heroku create
$ git push heroku master
$ heroku open
```

## Postman Testing

Use the following postman collection to test the REST API.

[Postman Collection](https://www.getpostman.com/collections/316dc4d4e748fe9810e9) 

## Documentation

For more information about using Java on Heroku, see these Dev Center articles:

- [Java on Heroku](https://devcenter.heroku.com/categories/java)

## Prepare the app

![alt text](https://github.com/k26duran/HerokuBasic/blob/master/img/1.PNG "running app")

#### App execute in localhost

![alt text](https://github.com/k26duran/HerokuBasic/blob/master/img/2.PNG "view of localhost")

#### What the application do?

The application offers a REST service in which we can perform operations such as get, post, push and delete on the user and car entities.

#### Describe the REST services exposed by the application

It is based on the controllers of two entities: user and car.

#### For what purpose is the Procfile plaintext file?  

The Procfile is always a simple text file that is named Procfile without a file extension. For example, Procfile.txt is not valid.The Procfile must live in your app’s root directory. It does not function if placed anywhere else. A Procfile declares its process types on individual lines.
The Procfile model of running processes types is extremely flexible. You can run any number of dynos with whatever arbitrary commands you want, and scale each independently.

## Deploy the app

![alt text](https://github.com/k26duran/HerokuBasic/blob/master/img/3.PNG "inicializar repositorio de forma local")
![alt text](https://github.com/k26duran/HerokuBasic/blob/master/img/4.PNG "heroku create")
![alt text](https://github.com/k26duran/HerokuBasic/blob/master/img/5.PNG "git add .")
![alt text](https://github.com/k26duran/HerokuBasic/blob/master/img/6.PNG "git commit")
![alt text](https://github.com/k26duran/HerokuBasic/blob/master/img/7.PNG "git push heroku master")
![alt text](https://github.com/k26duran/HerokuBasic/blob/master/img/7.1.PNG "part of git push")
![alt text](https://github.com/k26duran/HerokuBasic/blob/master/img/8.PNG "heroku ps:scale")
![alt text](https://github.com/k26duran/HerokuBasic/blob/master/img/9.PNG "heroku open")
![alt text](https://github.com/k26duran/HerokuBasic/blob/master/img/9.1.PNG "part of heroku open")

## View Logs
![alt text](https://github.com/k26duran/HerokuBasic/blob/master/img/10.PNG "view logs")

## Use a Database

![alt text](https://github.com/k26duran/HerokuBasic/blob/master/img/11.PNG "heroku addons")
![alt text](https://github.com/k26duran/HerokuBasic/blob/master/img/12.PNG "heroku config")
![alt text](https://github.com/k26duran/HerokuBasic/blob/master/img/13.PNG "heroku pg")


