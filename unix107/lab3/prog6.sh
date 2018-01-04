#!/bin/bash
if [ -d "$@" ]; then
    echo "Number of files is $(find "$@" -type f | wc -l)"
    echo "Number of directories is $(find "$@" -type d | wc -l)"
    echo "the files is $(find "$@" -type f )"
    echo "directories is $(find "$@" -type d )"
else
    echo "[ERROR]  Please provide a directory."
    exit 1
fi