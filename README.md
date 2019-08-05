# Play Framework Development Docker

## Quickstart

To run the dockerfile, simply run

```
./run-docker.sh
```

It will open the docker BASH. The project from `play-dev/` are mounted to the container, located on `/opt/play-dev/` . So you can navigate to your project

```
cd /opt/play-dev
```

From there, you can try to run the project

```
sbt run
```

## License

[MIT License](LICENSE)
