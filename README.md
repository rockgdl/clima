<h1 align="center">Readme
<p align="center"><i>instrucciones de instalacion para el proyecto Consulta de clima</i></p>
<div align="center">
  <a href="https://github.com/elangosundar/awesome-README-templates/stargazers"><img src="https://img.shields.io/github/stars/elangosundar/awesome-README-templates" alt="Stars Badge"/></a>
<a href="https://github.com/elangosundar/awesome-README-templates/network/members"><img src="https://img.shields.io/github/forks/elangosundar/awesome-README-templates" alt="Forks Badge"/></a>
<a href="https://github.com/elangosundar/awesome-README-templates/pulls"><img src="https://img.shields.io/github/issues-pr/elangosundar/awesome-README-templates" alt="Pull Requests Badge"/></a>
<a href="https://github.com/elangosundar/awesome-README-templates/issues"><img src="https://img.shields.io/github/issues/elangosundar/awesome-README-templates" alt="Issues Badge"/></a>
<a href="https://github.com/elangosundar/awesome-README-templates/graphs/contributors"><img alt="GitHub contributors" src="https://img.shields.io/github/contributors/elangosundar/awesome-README-templates?color=2b9348"></a>
<a href="https://github.com/elangosundar/awesome-README-templates/blob/master/LICENSE"><img src="https://img.shields.io/github/license/elangosundar/awesome-README-templates?color=2b9348" alt="License Badge"/></a>
</div>
<br>
<br>
instrucciones de instalacion , este proyecto es un proyecto elaborado en SpringBoot y  Java 17 , como Jdk de programacion 

lo primero que hay que hacer es clonar la URL  https://github.com/rockgdl/clima.git en tu computador, si lo haces con eclipse, sera necesario darle click derecho, importar , from Git , pegar la url
y utilizar el siguiente usuario 

usuario : rockgdl:
token : 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
 preguntara cual es la rama inicial, es importante seleccionar que se usara la de dev!!!!!

una vez descargado  , preguntara como importar el proyecto, se debera seleccionar que se importe como proyecto general , finalizado  , tendremos una carpeta llamada clima, que es el nombre del proyecto y dentro de esta existira otra carpeta con el mismo nombre (clima) el cual internamente tendra unos archivos mvnw. mvnw.cmd y pom.xml los cuales debemos mover a la carpeta raiz , para poder convertirlo  a proyecto Maven , lo haremos de la siguiente manera, click derecho en el proyecto , configure, convertir proyecto maven lo cual empezara el desepaquetado y la conversion de proyecto maven 

nos debera aparecer de la siguiente manera
<img width="266" alt="image" src="https://github.com/rockgdl/clima/assets/45295477/18f8d7d3-5f2f-4911-be07-cb2b692035b1"> 

dicho esto , es hora de iniciar la base de datos, la cual en la carpeta de recursos se encuentran 2 archivos, database_clima.sql y un Dockerfile :

este contiene las instrucciones para bajar la imagen de msyql y hacer la configuracion de base de datos 

a este paso abrimos una terminal donde podamos ingresar comandos de docker (dependiendo sistema operativo) wsl o cmd 

y vamos a navegar al workspace donde instalamos el proyecto eclipse , por ejemplo c/Users/001109781/eclipse-workspace/clima/src/main/resources , ahi ejecutaremos el siguiente comando 
podman build -t mysql_db .     // es en mi caso lo estoy haciendo atraves de Podman ya que Docker tiene tipo de licencia reemplazar podman por docker 

seguido a esto hay que correr el siguiente comando para exponer el puerto de docker al puerto de nuestra computadora

podman run -p 3306:3306  mysql_db

este comando construira la imagen de docker  añadiendo el archivo database_clima.sql, el cual contiene instrucciones de añadir un usuario por defecto de mysql y darle permisos para poder desplegar la aplicacion

dicho esto sera necesario dentro del proyecto abrir la Clase ClimaApplication.java y correrla , esto nos generara una aplicacion corriendo sobre tomcat, exponiendo 2 endpoints

el primero localhost:8080/weather/guadalajara  // consulta el clima de la ciudad que va como parametro
 el segundo localhost:8080/historico/latest  //obtiene el historico de las ultimas ciudades consultadas

el primer servicio consume la restapi de la pagina  WeatherClima https://openweathermap.org/api usando un key que esta guardada en application.properties
donde el parametro es la ciudad, en este caso es guadalajara una ciudad de Jalisco en Mexico, la cual respondera con los centigrados , y posteriormente se guardara en la base de datos

al levantar el servicio ClimaApplication, este se levanta en un tomcat como servidor y expone los 2 endpoint 

<img width="926" alt="image" src="https://github.com/rockgdl/clima/assets/45295477/59cf6eca-4eab-4de3-88dd-2ac959796937">

este es un ejemplo de la respuesta que se obtendra guardado de la base de datos el historico 

<img width="353" alt="image" src="https://github.com/rockgdl/clima/assets/45295477/3389f41e-eb8c-4bf4-92a4-a61a7bc465d9">

este es un ejemplo  la base de datos 

<img width="347" alt="image" src="https://github.com/rockgdl/clima/assets/45295477/ea3c13ed-770c-4668-b0d8-f7d110c44655">



# Contribute

Contributions are always welcome! Please create a PR to add Github Profile.

## :pencil: License

This project is licensed under [MIT](https://opensource.org/licenses/MIT) license.

## :man_astronaut: Show your support

Give a ⭐️ if this project helped you!
