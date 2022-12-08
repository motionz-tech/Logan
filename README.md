
# Logan

[![license](https://img.shields.io/badge/license-MIT-brightgreen.svg?style=flat)](https://raw.githubusercontent.com/Meituan-Dianping/Logan/master/LICENSE)
[![Release Version](https://img.shields.io/github/release/Meituan-Dianping/Logan.svg?maxAge=2592000?style=flat-square)](https://github.com/Meituan-Dianping/Logan/releases)
[![PRs Welcome](https://img.shields.io/badge/PRs-welcome-brightgreen.svg)](https://github.com/Meituan-Dianping/Logan/pulls)
[![Platform Support](https://img.shields.io/badge/Platform-%20iOS%20%7C%20Android%20-brightgreen.svg)](https://github.com/Meituan-Dianping/Logan/wiki)

[中文说明](./README-zh.md)

# Overview
Logan is a log platform with ability to collect、store、upload and analyze front-end logs. We provide five components, including [iOS SDK](https://github.com/Meituan-Dianping/Logan/tree/master/Logan/iOS), [Android SDK](https://github.com/Meituan-Dianping/Logan/tree/master/Example/Logan-Android), [Web SDK](https://github.com/Meituan-Dianping/Logan/tree/master/Logan/WebSDK), analysis services [Server SDK](https://github.com/Meituan-Dianping/Logan/tree/master/Logan/Server) and [LoganSite](https://github.com/Meituan-Dianping/Logan/tree/master/Logan/LoganSite). In addition, we also provide a Flutter plugin [Flutter Plugin](https://github.com/Meituan-Dianping/Logan/tree/master/Flutter).

# Architecture
![Logan](https://mss-shon.sankuai.com/v1/mss_7d6cd84b52d543248bbb734abd392e9a/logan-open-source/logan_arch.png)

## Overivew of LoganSite

**Search Logs**

![Logan](./img/logan_list_filter.gif)


**Log Detail**

![Logan](./img/logan_detail.gif)

[How to use demo](https://github.com/Meituan-Dianping/Logan/wiki/How-to-use-demo)

[Log protocol](https://github.com/Meituan-Dianping/Logan/wiki/Log-protocol)

# Quick Start

## iOS SDK

### How to use SDK in your project

First create a file named Podfile, then copy the following code into the file. 

```
source 'https://github.com/CocoaPods/Specs.git'

platform :ios, '8.0'

target 'TargetName' do

pod 'Logan', '~> 1.2.5'

end
```
Finally run the following command in root directory of your project.

```
pod install 
```

### iOS SDK document

More to see: 
[iOS SDK](https://github.com/Meituan-Dianping/Logan/tree/master/Logan/iOS)


## Android SDK

```
Android Studio: Not required, version 3.4 or higher is recomand.

NDK: r16b

CMake: >= 3.4.1

Jdk: 1.7 or 1.8（recomand）
```

### Android SDK document

More to see: 
[Android SDK](https://github.com/Meituan-Dianping/Logan/tree/master/Example/Logan-Android)


## Web SDK
Web SDK supports logging in the H5 and browser environment.

### Install
Install logan-web using `npm`:

```
npm install --save logan-web
```

Or `yarn`:

```
yarn add logan-web
```

### Web SDK document

More to see: 
[Web SDK](https://github.com/Meituan-Dianping/Logan/tree/master/Logan/WebSDK)


## Server

### Server document

[Server](https://github.com/Meituan-Dianping/Logan/tree/master/Logan/Server)


## LoganSite
LoganSite provides a visualized way for developers to scan and search logs uploaded from App and Web.

### Environment
```
Node: ^10.15.3
yarn: ^1.15.2 或 npm ^6.12.0
```

### Install

First, clone the repository into to local.

Create `.env.development` in the directory of LoganSite,and set `API_BASE_URL` like below:
```bash
API_BASE_URL=http://location/to/your/server:port
```
Then execute the following command：
```
$ cd $LOGAN_SITE
$ npm install
$ npm run start
```
or
```
$ cd $LOGAN_SITE
$ yarn
$ yarn start
```

#### Build

First, clone the repository into to local.

Replace the fourth line in LoganSite/src/common/api.js with follow:
```javascript
const BASE_URL = "http://location/to/your/server:port"
```
Then execute the following command：
```
$ cd $LOGAN_SITE
$ npm install
$ npm run build
```
or
```
$ cd $LOGAN_SITE
$ yarn
$ yarn build
```

### LoganSite document

More to see: 
[LoganSite](https://github.com/Meituan-Dianping/Logan/tree/master/Logan/LoganSite)


# Best Practices

Before Logan available, log report system is relatively scattered.

![Before_Logan](https://mss-shon.sankuai.com/v1/mss_7d6cd84b52d543248bbb734abd392e9a/logan-open-source/before_logan.png)

To put it simply, the traditional idea is to piece together the problems that appear in the logs of each system, but the new idea is to aggregate and analyze all the logs generated by the user to find the scenes with problems.

The Logan core system consists of four modules:

- Input
- Storage
- BackEnd
- FrontEnd

![Logan_Process](https://mss-shon.sankuai.com/v1/mss_7d6cd84b52d543248bbb734abd392e9a/logan-open-source/logan_process.png)

The new case analysis process is as follows:

![Logan_Case](https://mss-shon.sankuai.com/v1/mss_7d6cd84b52d543248bbb734abd392e9a/logan-open-source/logan_case.png)


# Feature

In the future, we will provide a data platform based on Logan big data, including advanced functions such as machine learning, troubleshooting log solution, and big data feature analysis.

Finally, we hope to provide a more complete integrated case analysis ecosystem.

![Logan_System](https://mss-shon.sankuai.com/v1/mss_7d6cd84b52d543248bbb734abd392e9a/logan-open-source/logan_system.png)

| Module | Open Source | Processing | Planning |
| :------: | :--: | :-----: | :-: |
| iOS & macOS |   √  |        |    |
| Android | √ |  |  |
| Web |  | √ |  |
| Mini Programs |  | √ |  |
| Back End |  |  | √ |
| Front End |  |  | √ |

# Contributing

**For more information about contributing PRs and issues, see our [Contribution Guidelines](./CONTRIBUTING.md).**

# Authors

* **White Bai** - Core Developer - [baitian0521](https://github.com/baitian0521)

* **Richard Cao** - Core Developer - [Richard-Cao](https://github.com/Richard-Cao)

* **jiangteng** - Core Developer - [jiangteng](https://github.com/jiangteng)

* **yangxiangnan** - Core Developer - [yangxiangnan](https://github.com/yangxiangnan)

* **Mr-xiaojun** - Core Developer - [Mr-xiaojun](https://github.com/Mr-xiaojun)

See also the list of [contributors](https://github.com/Meituan-Dianping/Logan/graphs/contributors) who participated in this project.

# Contact

WeChat ID: 

MTDPtech, MTDPtech01, MTDPtech03

# License

Logan is licensed under the MIT License - see the [LICENSE](https://github.com/Meituan-Dianping/Logan/blob/master/LICENSE) file for details.

# Article
[A lightweight case logging system based on mobile platform developed by Meituan-Dianping — Logan](https://tech.meituan.com/Logan.html)

[Logan: Open Source](https://tech.meituan.com/logan_open_source.html)

[Introduction to Logan Web SDK](https://tech.meituan.com/2020/01/09/meituan-logan.html)

# Acknowledgments
- [mbedtls](https://github.com/ARMmbed/mbedtls)
- [cJSON](https://github.com/DaveGamble/cJSON)
