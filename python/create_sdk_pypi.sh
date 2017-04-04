#!/bin/bash

if [ ! "$1" ]; then
    echo "package name {sdk|config_converter} not provided"
    exit
fi

if [ $1 == "sdk" ]; then
    PACKAGES=sdk
else
    PACKAGES=migrationtools
fi

cp avi/$PACKAGES/setup.py .
cp avi/$PACKAGES/MANIFEST.in .
AVI_PIP_VERSION=`python version.py`
AVI_PIP_VERSION_TAG="$AVI_PIP_VERSION"
if [ ! -z "$2" ]; then
    AVI_PIP_VERSION_TAG="$AVI_PIP_VERSION.$2"
fi
sed -i s/"AVI_PIP_VERSION =.*$"/"AVI_PIP_VERSION = \'AVI_PIP_VERSION_TAG\'"/g setup.py
sed -i s/"__version__ =.*$"/"__version__ = \'$AVI_PIP_VERSION\'"/g avi/$PACKAGES/__init__.py
echo "uploading to the pypi "
twine upload dist/*
echo "cleanup"
if [ $1 == "sdk" ]; then
    rm -rf avisdk.egg-info
elif [ $1 == "config_converter" ]; then
    rm -rf avimigrationtools.egg-info
fi
rm -f setup.py
rm -f MANIFEST.in
sed -i s/"__version__ =.*$"/"__version__ = \'\'"/g avi/$PACKAGES/__init__.py
