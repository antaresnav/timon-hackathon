Antares Maps and Navigation SDK for Android Sample application
===================================

Sample project that use the [Antares Maps and Navigation SDK for Android](http://antaressdk.com/).

Pre-requisites
--------------

- Android SDK v26
- Android Build Tools v26.0.2

Getting Started
---------------

This sample uses the Gradle build system. 

First download the project by cloning this repository or downloading an archived
snapshot. (See the options on the right hand side.)

In Android Studio, use the "Import non-Android Studio project" or 
"Import Project" option. If prompted for a gradle configuration
accept the default settings. 

Alternatively use the "gradlew build" command to build the project directly.

Installation
------------

The current version can be downloaded: 
https://github.com/antaresnav/timon-hackathon/blob/master/release/hackathon-1.0.apk?raw=true

Documentation
-------------

- AntaresMaps reference documentation: http://antaresnav.hu/docs/antaresmaps/
- AntaresNavigation reference documentation: http://antaresnav.hu/docs/antaresnavigation/

Map Styles
----------
The data source and visual appearance of the displayed maps are defined by style documents and can be set by the AntaresMap#setStyleUrl(String url) method. The following map styles are provided as examples:

- OSM bright (worldwide)
http://temp.geox.hu:18093/demo/vectiles_styles/openmaptiles_bright_antaresmod.json

- OSM Basic (worldwide)
http://temp.geox.hu:18093/demo/vectiles_styles/openmaptiles_basic_antaresmod.json

- OWM cloud coverage (worldwide)
https://terkep.geox.hu/timon/TIMON_OSM_basic_default_DAY_overlay_OWM_CloudsPrecip.json

- DigitalGlobe satellite map (worldwide)
https://terkep.geox.hu/timon/TIMON_DigitalGlobe.json

- TIMON Basic map (Slovenia)
https://terkep.geox.hu/timon/TIMON_basic_default_mbgl_style_antaresmod_STATIC.json

- TIMON Night map (Slovenia)
https://terkep.geox.hu/timon/TIMON_basic_default_mbgl_style_NIGHT_antaresmod_STATIC.json

- TIMON Bicycle map (Slovenia)
https://terkep.geox.hu/timon/TIMON_cycle_DAY_mbgl_style_antaresmod_STATIC.json

- TIMON Bicycle map (Slovenia) night
https://terkep.geox.hu/timon/TIMON_cycle_NIGHT_mbgl_style_antaresmod_STATIC.json

Support
-------

- email: timon.hackathon@antaresnav.hu

If you've found an error in these samples, please file an issue:
https://github.com/antaresnav/timon-hackathon/issues
