/*
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, see <https://www.gnu.org/licenses/>.
 */

package net.sergofox123.versecraft;

import net.frozenblock.lib.FrozenBools;
import net.frozenblock.lib.feature_flag.api.FrozenFeatureFlags;
import net.minecraft.world.flag.FeatureFlag;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;

public class VerseFeatureFlags {
	public static final FeatureFlag VERSE_CRAFT = FrozenFeatureFlags.builder.create(VerseSharedConstants.id(VerseSharedConstants.MOD_ID));
	public static final FeatureFlagSet VERSE_CRAFT_FLAG_SET = FeatureFlagSet.of(VERSE_CRAFT);

	public static final FeatureFlag FEATURE_FLAG = FrozenBools.IS_DATAGEN ? VERSE_CRAFT : FeatureFlags.VANILLA;

	public static void init() {
	}
}