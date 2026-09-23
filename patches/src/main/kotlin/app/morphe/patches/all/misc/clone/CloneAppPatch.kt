package app.morphe.patches.all.misc.clone

import app.morphe.patcher.patch.resourcePatch

internal val cloneAppPatch = resourcePatch {}

fun setOrGetFallbackPackageName(fallbackPackageName: String): String = fallbackPackageName
