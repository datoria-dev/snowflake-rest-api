#!/bin/bash
openapi-generator generate  --input-spec-root-directory ./releases/8.40/specifications -g scala-http4s --package-name datoria.snowflake

