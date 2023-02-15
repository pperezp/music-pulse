# Changelog

All notable changes to this project will be documented in this file. See [standard-version](https://github.com/conventional-changelog/standard-version) for commit guidelines.

## 1.3.0 (2023-02-15)


### Features

* add entities to project ([35af598](https://github.com/pperezp/music-pulse/commits/35af598abe4385060c41b3575d7c083a56962876))
* add GET /api/v1/artists/{id}/discography endpoint ([44ee87a](https://github.com/pperezp/music-pulse/commits/44ee87a21d6105eb39286a7a5959db6ed7354e42))
* add GET /api/v1/artists/{id}/videos endpoint ([3337d80](https://github.com/pperezp/music-pulse/commits/3337d804e5f0521a1c99ebf59f38cd945299839e))
* add GET /artists (with pagination and sort) ([18f05af](https://github.com/pperezp/music-pulse/commits/18f05afc0c4b93865feee8b62c231dd8998e83bc))
* add hexagonal architecture ([e20a144](https://github.com/pperezp/music-pulse/commits/e20a1448d4465fda8528185dfb1be85aa8a58cd4))
* add mysql script to project ([1912606](https://github.com/pperezp/music-pulse/commits/19126064d63781e2e2baf16883153a75e731227e))
* add mysql script to project ([01ab95a](https://github.com/pperezp/music-pulse/commits/01ab95abd8055546afb31ff1e48d51318df5f57e))
* add primary port (artist rest) ([4318946](https://github.com/pperezp/music-pulse/commits/431894603ddaff0ddc8593f5e45122ee54272c93))
* add repositories and artist controller ([37b24f4](https://github.com/pperezp/music-pulse/commits/37b24f434e2d2c54e84d8a3673aa2b4e1bac4960))
* add standard version ([c1ca6a3](https://github.com/pperezp/music-pulse/commits/c1ca6a31682f2b29c66867fd206571d077789914))
* implement search artist in ArtistService (+unit test) ([8f7e256](https://github.com/pperezp/music-pulse/commits/8f7e25677f27595c68dbadd550eec5a6fea208bf))
* implement search by name in ArtistRepository (+ unit test) ([caebd84](https://github.com/pperezp/music-pulse/commits/caebd84b12b22ec04fa2a21f3a22694c21c14396))
* initial commit (mysql configuration in application.properties) ([050ba9f](https://github.com/pperezp/music-pulse/commits/050ba9fd66e645c5d2df59d303f71f31b3afc40c))


### Bug Fixes

* add cross origin to rest artist file ([d1a5127](https://github.com/pperezp/music-pulse/commits/d1a512778e0b5f1f4cc48ecacf1fb75403dcee28))
* fix dockerfile ([9556ca2](https://github.com/pperezp/music-pulse/commits/9556ca2cb6385c7db21a83c2c6d9c6e6ec1397d1))
* fix GET /artists endpoint (Artist Lite Dto) ([93bfc6d](https://github.com/pperezp/music-pulse/commits/93bfc6d87d47fdcfe62ab39234e5a21eb4ea4f7c))
* remove duplicate package (musicpulse) ([cbf066b](https://github.com/pperezp/music-pulse/commits/cbf066bf8ee66fe53aa1aa3076b4e01d93b92f0f))


### Refactor

* change name package for order ([ad746e5](https://github.com/pperezp/music-pulse/commits/ad746e59eca449e2b520741863eee029d1a7a46a))
* clean code ([21de29a](https://github.com/pperezp/music-pulse/commits/21de29afce3aafea62bd55ae01516cb7b5f69653))
* clean code (order packages) ([261b7d8](https://github.com/pperezp/music-pulse/commits/261b7d85418442b6cdf748d206facafcd2017f76))
* clean code and chenge ArtistDto ([c5c9e1d](https://github.com/pperezp/music-pulse/commits/c5c9e1dc3700d58e1ebc06cad446fc2b794a4ceb))
* clean some code ([845c38b](https://github.com/pperezp/music-pulse/commits/845c38b7ebb09723cf0a61b1ac1222ee1d461222))
* create PageDto instead Page ([4e88c17](https://github.com/pperezp/music-pulse/commits/4e88c171540443679afb1de146f6c528069cb3da))


### Test

* add search artist endpoint test ([234d348](https://github.com/pperezp/music-pulse/commits/234d34891d988c3baebcc3d493352313d54c755e))

## [1.2.0](https://github.com/pperezp/music-pulse/compare/v1.1.0...v1.2.0) (2023-02-10)


### Features

* add GET /api/v1/artists/{id}/discography endpoint ([44ee87a](https://github.com/pperezp/music-pulse/commits/44ee87a21d6105eb39286a7a5959db6ed7354e42))
* add GET /api/v1/artists/{id}/videos endpoint ([3337d80](https://github.com/pperezp/music-pulse/commits/3337d804e5f0521a1c99ebf59f38cd945299839e))
* implement search artist in ArtistService (+unit test) ([8f7e256](https://github.com/pperezp/music-pulse/commits/8f7e25677f27595c68dbadd550eec5a6fea208bf))
* implement search by name in ArtistRepository (+ unit test) ([caebd84](https://github.com/pperezp/music-pulse/commits/caebd84b12b22ec04fa2a21f3a22694c21c14396))


### Bug Fixes

* fix GET /artists endpoint (Artist Lite Dto) ([93bfc6d](https://github.com/pperezp/music-pulse/commits/93bfc6d87d47fdcfe62ab39234e5a21eb4ea4f7c))


### Test

* add search artist endpoint test ([234d348](https://github.com/pperezp/music-pulse/commits/234d34891d988c3baebcc3d493352313d54c755e))

## 1.1.0 (2023-02-09)


### Features

* add entities to project ([35af598](https://github.com/pperezp/music-pulse/commits/35af598abe4385060c41b3575d7c083a56962876))
* add GET /artists (with pagination and sort) ([18f05af](https://github.com/pperezp/music-pulse/commits/18f05afc0c4b93865feee8b62c231dd8998e83bc))
* add hexagonal architecture ([e20a144](https://github.com/pperezp/music-pulse/commits/e20a1448d4465fda8528185dfb1be85aa8a58cd4))
* add mysql script to project ([1912606](https://github.com/pperezp/music-pulse/commits/19126064d63781e2e2baf16883153a75e731227e))
* add mysql script to project ([01ab95a](https://github.com/pperezp/music-pulse/commits/01ab95abd8055546afb31ff1e48d51318df5f57e))
* add primary port (artist rest) ([4318946](https://github.com/pperezp/music-pulse/commits/431894603ddaff0ddc8593f5e45122ee54272c93))
* add repositories and artist controller ([37b24f4](https://github.com/pperezp/music-pulse/commits/37b24f434e2d2c54e84d8a3673aa2b4e1bac4960))
* add standard version ([c1ca6a3](https://github.com/pperezp/music-pulse/commits/c1ca6a31682f2b29c66867fd206571d077789914))
* initial commit (mysql configuration in application.properties) ([050ba9f](https://github.com/pperezp/music-pulse/commits/050ba9fd66e645c5d2df59d303f71f31b3afc40c))


### Bug Fixes

* remove duplicate package (musicpulse) ([cbf066b](https://github.com/pperezp/music-pulse/commits/cbf066bf8ee66fe53aa1aa3076b4e01d93b92f0f))


### Refactor

* change name package for order ([ad746e5](https://github.com/pperezp/music-pulse/commits/ad746e59eca449e2b520741863eee029d1a7a46a))
* clean code ([21de29a](https://github.com/pperezp/music-pulse/commits/21de29afce3aafea62bd55ae01516cb7b5f69653))
* clean code (order packages) ([261b7d8](https://github.com/pperezp/music-pulse/commits/261b7d85418442b6cdf748d206facafcd2017f76))
* clean code and chenge ArtistDto ([c5c9e1d](https://github.com/pperezp/music-pulse/commits/c5c9e1dc3700d58e1ebc06cad446fc2b794a4ceb))
* clean some code ([845c38b](https://github.com/pperezp/music-pulse/commits/845c38b7ebb09723cf0a61b1ac1222ee1d461222))
* create PageDto instead Page ([4e88c17](https://github.com/pperezp/music-pulse/commits/4e88c171540443679afb1de146f6c528069cb3da))
