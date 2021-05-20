# Using Dagger in your Android app
구글 코드랩 따라서 dagger 연습한 프로젝트
- 챕터가 끝날때마다 commit
- 주석 달면서 dagger 이해



## @Inject
- @Inject가 클래스 생성자에 주석을 달면 Dagger에게 해당 클래스의 인스턴스를 제공하는 방법을 알려줍니다.
- 클래스 필드에 주석을 달면 해당 유형의 인스턴스로 필드를 채워야 함을 Dagger에 알리는 것입니다.

## @Componet
- @Component 인터페이스는 Dagger가 컴파일 타임에 그래프를 생성하는 데 필요한 정보를 제공합니다. 
- 인터페이스 메소드의 매개 변수는 삽입을 요청하는 클래스를 정의합니다.





# License

```
Copyright 2019 Google LLC

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    https://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
