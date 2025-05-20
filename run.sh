#!/bin/bash

# Make sure a filename was provided
if [ -z "$1" ]; then
  echo "Usage: ./run.sh ClassName"
  exit 1
fi

CLASS="$1"
SRC="java/$CLASS.java"

# Check if the file exists
if [ ! -f "$SRC" ]; then
  echo "Error: $SRC not found"
  exit 1
fi

# Compile the Java file
javac "$SRC"
if [ $? -ne 0 ]; then
  echo "Compilation failed."
  exit 1
fi

# Run the compiled class
java -cp java "$CLASS"
