#!/bin/bash

cut -c20- $1 | grep -v "^\s" | grep -v "^$" | cut -d ";" -f 1 > "_"$1
