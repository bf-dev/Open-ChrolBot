package com.Ludicrous245.data

import com.Ludicrous245.tools.commands.CommandExecutor
import com.google.api.services.youtube.model.SearchResult
import com.iwebpp.crypto.TweetNaclFast
import net.dv8tion.jda.api.JDA
import net.dv8tion.jda.api.entities.Guild
import net.dv8tion.jda.api.entities.Member
import net.dv8tion.jda.api.entities.Message
import net.dv8tion.jda.api.entities.User

class Storage {
    companion object {
        var client: JDA? = null
        val commands:ArrayList<CommandExecutor> = ArrayList()
        val isLoop:HashMap<Guild, Boolean> = HashMap()
        val serverVol:HashMap<Guild, Int> = HashMap()
        val guildPrefix:HashMap<String, String> = HashMap()
        val guildMutedUser:HashMap<String, ArrayList<String>> = HashMap()
        val isPause:HashMap<Guild, Boolean> = HashMap()
        val playerSearching:HashMap<Member?, Boolean> = HashMap()
        val playerChooseItem:HashMap<Member?, List<SearchResult>?> = HashMap()
        val playerChooseMessage:HashMap<Member?, Message> = HashMap()
        val playerChooseBotMessage:HashMap<Member?, Message> = HashMap()
        val playerChooseLoaded:HashMap<Member?, Boolean> = HashMap()
    }
}