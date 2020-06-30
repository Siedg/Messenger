package com.siedg.messenger.messages

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.siedg.messenger.R
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.GroupieViewHolder
import com.xwray.groupie.Item
import kotlinx.android.synthetic.main.activity_chat_log.*

class ChatLogActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat_log)
        supportActionBar?.title = "Chat Log"

        val adapter = GroupAdapter<GroupieViewHolder>()
        adapter.add(ChatItem())
        recyclerview_chat_log.adapter = adapter
    }
}


class ChatItem: Item<GroupieViewHolder() {
    override fun bind(viewHolder: GroupieViewHolder, position: Int) {

    }

    override fun getLayout(): Int {
        return R.layout.chat_from_row
    }
}