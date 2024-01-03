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
podman build -t mysql_db .     // es en mi caso lo estoy haciendo atraves de Podman ya que Docker tiene tipo de licencia 









## Contents
  - [Github README PROFILE CATEGORY](#github-readme-profile-category)
  - [List out `Awesome README Profile` Tools](#list-out-awesome-readme-profile-tools)
  - [List out `Awesome README Profile` Articles](#list-out-awesome-readme-profile-articles)
  - [Contribute](#contribute)

## Website

Link : https://awesome-github-readme-profile.netlify.app

<a href="https://awesome-github-readme-profile.netlify.app"><img src="https://raw.githubusercontent.com/elangosundar/awesome-README-templates/master/awesome-github-profile.png" alt="Awesome README Templates" /></a>


## Github README PROFILE CATEGORY

- [ ] [Art](art)
- [ ] [Code Styled](code-styled)
- [ ] [Creativity](creativity)
- [ ] [Flowcharts](flowcharts)
- [ ] [Default](default)
- [ ] [Dynamic Realtime](dynamic-realtime)
- [ ] [Elaborate](elaborate)
- [ ] [Multimedia](multimedia)
- [ ] [Short-and-sweet](short-and-sweet)
- [ ] [Tabular](tabular)
- [ ] [Pie Charts](pie-charts)

# List out `Awesome README Profile` Tools

- [Profile Summary For Github](https://profile-summary-for-github.com/search)
- [Github Readme Stats](https://github.com/anuraghazra/github-readme-stats) - Dynamically generated stats for your github readmes
- [Profile Activity Generator](https://github.com/omidnikrah/profile-activity-generator) - Generate custom profile activity for your profile README
- [All Dev Stats in Readme](https://github.com/anmol098/waka-readme-stats) - Are you an early 🐤 or a night 🦉? When are you most productive during the day? What languages you code in? And other stuff... Let's check out in your readme!
- [Visitor Badge](https://visitor-badge.glitch.me/#docs) - Count visitors for your README.md, Issues, PRs in GitHub
- [1990s style Visitor Counter](https://twitter.com/ryanlanciaux/status/1283755637126705152) - Add a 1990s style visitor counter with one line of markdown.
- [Vists Count](https://pufler.dev/git-badges/) - Count visitors for README.md that can be used with shields.io
- [Shields Project](https://shields.io/) - Use Shields to create profile badges, compatible with Simple Icons
- [Simple Icons](https://github.com/simple-icons/simple-icons#cdn-usage) - SVG icons for popular brands for your README.md files
- [Laravel GitHub Profile Visit Counter](https://github.com/caneco/laravel-github-profile-view-counter) - Add on your Laravel project a quick-badge to count your profile visits.
- [Dev Metrics in Readme](https://github.com/athul/waka-readme) - [WakaTime](https://wakatime.com/) Weekly Metrics on your Profile Readme
- [Current UTC time](https://github.com/jojoee/jojoee) - Example code of server that can serve dynamic content on GitHub profile
- [Github Activity in README](https://github.com/jamesgeorge007/github-activity-readme) - Updates `README.md` with the recent GitHub activity of a user
- [Github Profile README Generator](https://github.com/rahuldkjain/github-profile-readme-generator) - This tool provides an easy way to create github profile readme with latest addons like `visitors count`, `github stats` etc.
- [Dynamic Profile Page On Github](https://github.com/umutphp/github-action-dynamic-profile-page) - Get dynamically generated list of your commits (of the repositories that the action is configured) on GitHub profile readme.
- [npm package downloads](https://github.com/maddhruv/github-readme-npm-downloads) - Show all of your npm packages and their total downloads
- [Feedparser](https://pythonhosted.org/feedparser/) - Convenient processing of RSS files
- [Github Profile README Generator](https://github.com/arturssmirnovs/github-profile-readme-generator) - This project allows you to create nice and simple github profile readme files.
- [Github Gist Count Generator](https://github.com/lifeparticle/Gist-Count) - Get gist count for your github readmes.

# List out `Awesome README Profile` Articles

# Contribute

Contributions are always welcome! Please create a PR to add Github Profile.

## :pencil: License

This project is licensed under [MIT](https://opensource.org/licenses/MIT) license.

## :man_astronaut: Show your support

Give a ⭐️ if this project helped you!
