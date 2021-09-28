==> Config Center for Local Files <==

51320@HostName MINGW64 /e/data/MicroCloud/MicroCloud-Configuration-Center
$ ll
total 2
-rw-r--r-- 1 51320 197609 58 9月  13 20:03 configService.yml
-rw-r--r-- 1 51320 197609 54 9月  13 20:04 configService-dev.yml

51320@HostName MINGW64 /e/data/MicroCloud/MicroCloud-Configuration-Center
$ cat configService.yml
tracer.property: "I AM THE DEFAULT"
name: "Config Center"

51320@HostName MINGW64 /e/data/MicroCloud/MicroCloud-Configuration-Center
$ cat configService-dev.yml
tracer.property: "I AM THE DEV"
name: "Config Center"

Url: http://localhost:8888/configService/dev
{"name":"configService","profiles":["dev"],"label":null,"version":null,"state":null,"propertySources":[{"name":"file:e:/data/MicroCloud/MicroCloud-Configuration-Center/configService-dev.yml","source":{"tracer.property":"I AM THE DEV","name":"Config Center"}},{"name":"file:e:/data/MicroCloud/MicroCloud-Configuration-Center/configService.yml","source":{"tracer.property":"I AM THE DEFAULT","name":"Config Center"}}]}

Url: http://localhost:8888/configService/default
{"name":"configService","profiles":["default"],"label":null,"version":null,"state":null,"propertySources":[{"name":"file:e:/data/MicroCloud/MicroCloud-Configuration-Center/configService.yml","source":{"tracer.property":"I AM THE DEFAULT","name":"Config Center"}}]}


##### Access rules
/{application}/{profile}[/{label}]
/{application}-{profile}.yml
/{label}/{application}-{profile}.yml
/{application}-{profile}.properties
/{label}/{application}-{profile}.properties

{application} is just the application name, for example: application-redis
{profile} should be the version like dev / local
{label} should be the branch name, default is master, invalid if file from local disk