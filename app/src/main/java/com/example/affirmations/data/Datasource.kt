/*
 * Copyright (C) 2023 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.affirmations.data

import com.example.affirmations.R
import com.example.affirmations.model.Affirmation

/**
 * [Datasource] generates a list of [Affirmation]
 */
class Datasource() {
    fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(R.string.affirmation1_title, R.string.affirmation1_desc, R.drawable.image1),
            Affirmation(R.string.affirmation2_title, R.string.affirmation2_desc, R.drawable.image2),
            Affirmation(R.string.affirmation3_title, R.string.affirmation3_desc, R.drawable.image3),
            Affirmation(R.string.affirmation4_title, R.string.affirmation4_desc, R.drawable.image4),
            Affirmation(R.string.affirmation5_title, R.string.affirmation5_desc, R.drawable.image5),
            Affirmation(R.string.affirmation6_title, R.string.affirmation6_desc, R.drawable.image6),
            Affirmation(R.string.affirmation7_title, R.string.affirmation7_desc, R.drawable.image7),
            Affirmation(R.string.affirmation8_title, R.string.affirmation8_desc, R.drawable.image8),
            Affirmation(R.string.affirmation9_title, R.string.affirmation9_desc, R.drawable.image9),
            Affirmation(R.string.affirmation10_title, R.string.affirmation10_desc, R.drawable.image10))
    }
}