/*
 * Copyright (C) 2019 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.dagger.registration

import com.example.android.dagger.user.UserManager
import javax.inject.Inject

/**
 * RegistrationViewModel is the ViewModel that the Registration flow ([RegistrationActivity]
 * and fragments) uses to keep user's input data.
 */

/**
 * 애플리케이션 그래프를 자동으로 구축하기 위해
 * Dagger는 그래프의 클래스에 대한 인스턴스를 만드는 방법을 알아야합니다.
 * 이를 수행하는 한 가지 방법은 @Inject로 클래스 생성자에 주석을 추가하는 것입니다.
 * 생성자 매개 변수(UserManager)는 해당 유형(RegistrationViewModel)의 종속성이됩니다.
 *
 * 다시말해 @Inject 를 사용하여
 * RegistrationViewModel 유형의 인스턴스를 만들었다.
 * 생성자가 UserManager의 인스턴스를 인수로 사용하므로,
 * RegistrationViewModel에는 종속성으로 UserManager가 있습니다.
 *
 */

class RegistrationViewModel  @Inject constructor(val userManager: UserManager) {

    private var username: String? = null
    private var password: String? = null
    private var acceptedTCs: Boolean? = null

    fun updateUserData(username: String, password: String) {
        this.username = username
        this.password = password
    }

    fun acceptTCs() {
        acceptedTCs = true
    }

    fun registerUser() {
        assert(username != null)
        assert(password != null)
        assert(acceptedTCs == true)

        userManager.registerUser(username!!, password!!)
    }
}
