# shoebill-api

[![Build Status](http://ci.gtaun.net/job/shoebill-api/badge/icon)](http://ci.gtaun.net/job/shoebill-api/)

The shoebill-api project is one part of the whole Shoebill project.
You can download and browse all the builds from our Jenkins server located at [Jenkins](http://ci.gtaun.net/)

#How to use it?

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
