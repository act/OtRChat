/*
 * Copyright (C) 2008 Esmertec AG.
 * Copyright (C) 2008 The Android Open Source Project
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

package org.gitian.android.im.app;

import org.gitian.android.im.provider.Imps;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class ChooseAccountActivity extends Activity {
    @Override
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);

        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setType(Imps.Provider.CONTENT_TYPE);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);

        finish();
    }
}