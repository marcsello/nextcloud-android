/*
 * Nextcloud Android client application
 *
 * @author Tobias Kaminsky
 * Copyright (C) 2021 Nextcloud
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU AFFERO GENERAL PUBLIC LICENSE
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU AFFERO GENERAL PUBLIC LICENSE for more details.
 *
 * You should have received a copy of the GNU Affero General Public
 * License along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.owncloud.android.ui.activity

import android.view.View
import dagger.hilt.android.AndroidEntryPoint

/**
 * Activity providing information about ways to participate in the app's development.
 */
@AndroidEntryPoint
class HuaweiCommunityActivity : CommunityActivity() {
    override fun setupContent() {
        super.setupContent()
        binding.communityReleaseCandidatePlaystore.visibility = View.GONE
    }
}
