/*
 * Copyright 2018 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.delaroystudios.viewpagertogrid.adapter;

import android.support.annotation.DrawableRes;
import com.delaroystudios.viewpagertogrid.R;

/**
 * Holds the image resource references used by the grid and the pager fragments.
 */
abstract class ImageData {

  @DrawableRes
  static final int[] IMAGE_DRAWABLES = {
      R.drawable.attitude,
      R.drawable.birthday1,
      R.drawable.emotions,
      R.drawable.fashion,
      R.drawable.fitness,
      R.drawable.food,
      R.drawable.friends,
      R.drawable.funny1,
      R.drawable.inspirational,
      R.drawable.love,
      R.drawable.nature,
      R.drawable.others1,
      R.drawable.photography,
      R.drawable.travel
  };

}
