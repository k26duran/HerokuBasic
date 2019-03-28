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

We initialize the local repository

![alt text](https://github.com/k26duran/HerokuBasic/blob/master/img/3.PNG "inicializar repositorio de forma local")

The heroku create CLI command creates a new empty application on Heroku, along with an associated empty Git repository. If you run this command from your app’s root directory, the empty Heroku Git repository is automatically set as a remote for your local repository.

![alt text](https://github.com/k26duran/HerokuBasic/blob/master/img/4.PNG "heroku create")

Add the app on the repository

![alt text](https://github.com/k26duran/HerokuBasic/blob/master/img/5.PNG "git add .")

Commit

![alt text](https://github.com/k26duran/HerokuBasic/blob/master/img/6.PNG "git commit")

To deploy the app to Heroku

![alt text](https://github.com/k26duran/HerokuBasic/blob/master/img/7.PNG "git push heroku master")

Push

![alt text](https://github.com/k26duran/HerokuBasic/blob/master/img/7.1.PNG "part of git push")

Running heroku ps:scale web=1 will scale your app to one running dyno, basically meaning you have one server running your app currently.

![alt text](https://github.com/k26duran/HerokuBasic/blob/master/img/8.PNG "heroku ps:scale")

To open the app.

![alt text](https://github.com/k26duran/HerokuBasic/blob/master/img/9.PNG "heroku open")
![alt text](https://github.com/k26duran/HerokuBasic/blob/master/img/9.1.PNG "part of heroku open")

## View Logs

It serves to obtain the most recent records of your application, and you can follow the records using --tail (or -t).

![alt text](https://github.com/k26duran/HerokuBasic/blob/master/img/10.PNG "view logs")

## Use a Database

Add-ons are cloud services that extend Heroku apps with useful features and services, such as:
	* Data stores
	* Logging
	* Monitoring
	* Content management
An add-on interacts with a Heroku app in one or more of the following ways:
	* It sets one or more config vars in the app with values necessary to communicate with the add-on. These values typically include the cloud service’s URL and any credentials necessary to access that URL.
	* It reads or writes to the app’s logs.
	* It uses the Heroku Platform API for Partners to perform app management actions (such as dyno scaling) on behalf of the app’s developer.

![alt text](https://github.com/k26duran/HerokuBasic/blob/master/img/11.PNG "heroku addons")

Config heroku

![alt text](https://github.com/k26duran/HerokuBasic/blob/master/img/12.PNG "heroku config")

Show some information about database.

![alt text](https://github.com/k26duran/HerokuBasic/blob/master/img/13.PNG "heroku pg")


