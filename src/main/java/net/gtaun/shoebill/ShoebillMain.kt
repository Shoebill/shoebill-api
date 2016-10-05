package net.gtaun.shoebill

/**
 * This annotation marks a class as the main-entry class.
 *
 * @author Marvin Haschker
 */
annotation class ShoebillMain(val name: String, val author: String = "", val description: String = "",
                              val version: String = "", val buildDate: String = "Unknown", val buildNumber: Int = 0,
                              val loadPriority: Int = 0)