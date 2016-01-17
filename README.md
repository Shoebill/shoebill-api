# shoebill-api

[![Join the chat at https://gitter.im/Shoebill/shoebill-api](https://badges.gitter.im/Shoebill/shoebill-api.svg)](https://gitter.im/Shoebill/shoebill-api?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)

[![Build Status](http://ci.gtaun.net/job/shoebill-api/badge/icon)](http://ci.gtaun.net/job/shoebill-api/)

# What is the shoebill-api?

The shoebill-api project is one part of the whole Shoebill project.
You can download and browse all the builds from our Jenkins server located at [Jenkins](http://ci.gtaun.net/)
or directly download the newest version from [here](http://ci.gtaun.net/job/shoebill-api/lastSuccessfulBuild/artifact/target/shoebill-api-1.1-SNAPSHOT.jar)

# Resources

Currently, there are some videos on how to setup a Shoebill server & create your first gamemode.
There also is a JavaDoc at [Shoebill-API JavaDoc](http://shoebill.github.io/apidoc/).
The videos can be found here:

**Setting up a shoebill server:**

[![Setting up a Shoebill Server](http://img.youtube.com/vi/FLlFeNXPPN8/0.jpg)](https://www.youtube.com/watch?v=FLlFeNXPPN8 "Setting up a Shoebill Server")

**Creating your first gamemode in IntelliJ IDEA 14:**

[![Gamemode in IntelliJ IDEA 14](http://img.youtube.com/vi/g2SOqax3Euw/0.jpg)](https://www.youtube.com/watch?v=g2SOqax3Euw "Gamemode in IntelliJ IDEA 14")

**Creating your first gamemode in Eclipse:**

[![Gamemode in Eclipse](http://img.youtube.com/vi/Bg0pNhY1vgE/0.jpg)](https://www.youtube.com/watch?v=Bg0pNhY1vgE "Gamemode in Eclipse")


# How to use it?

If you want to use the shoebill-api, you will either have to download the dependency from our Jenkins server and add it manually to your game mode (different from IDE to IDE), or better: You use maven, and you just have to add our repository to yours <repository> section. The following code is needed, in order to access all shoebill related artifacts:

    <repository>
        <id>gtaun-public-repo</id>
        <name>GTAUN Public Repository</name>
        <url>http://repo.gtaun.net/content/groups/public</url>
    </repository>

After that, you can add the following dependency into your pom.xml file in the <dependencies> section:

    <dependency>
        <groupId>net.gtaun</groupId>
        <artifactId>shoebill-api</artifactId>
        <version>1.1-SNAPSHOT</version>
        <type>jar</type>
        <scope>compile</scope>
    </dependency>

# Example Usage

If you successfully added the shoebill-api to your java 8 project, you can create a new class and let it extend from the class "Gamemode". Implement the needed methods (onEnable, onDisable) and you are ready to go (gamemode.yml must be setup first to run the project). Here is a little example:

    public class MyGamemode extends Gamemode {

        private Logger logger;

        @Override
        public void onEnable() {
            logger = getLogger(); //you can access different methods from the Gamemode Baseclass
            //Do stuff, e.g. load mysql database and create instances of new classes that handle events etc.
            logger.info("My gamemode has been loaded!");
        }

        @Override
        public void onDisable() {
            logger.info("My gamemode is shutting down...");
            //Stop mysql connection, save files etc.
            logger.info("My gamemode has been shutted down!");
        }

    }

Here is another little example:

    public class MyGamemode extends Gamemode {

        @Override
        public void onEnable() {
            getEventManager().registerHandler(PlayerConnectEvent.class, (e) -> {
                Player player = e.getPlayer();
                player.sendMessage(Color.GREEN, "Hello " + player.getName() + ", on my server!");
            });
        }

        //onDisable()...

    }
