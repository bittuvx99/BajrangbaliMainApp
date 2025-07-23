package com.bajrangbali.mainapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bajrangbali.mainapp.databinding.ItemNoticeBinding
import com.bajrangbali.mainapp.model.Notice

class NoticeAdapter : RecyclerView.Adapter<NoticeAdapter.NoticeViewHolder>() {

    private var noticeList: MutableList<Notice> = mutableListOf()

    inner class NoticeViewHolder(val binding: ItemNoticeBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoticeViewHolder {
        val binding = ItemNoticeBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return NoticeViewHolder(binding)
    }

    override fun onBindViewHolder(holder: NoticeViewHolder, position: Int) {
        val notice = noticeList[position]

        holder.binding.noticeTitle.text = notice.title
        holder.binding.noticeDescription.text = notice.description
        holder.binding.tvNoticeDate.text = "Date: ${notice.date}"
        holder.binding.tvNoticeExpiry.text = "Expires: ${notice.expiryDate}"
    }

    override fun getItemCount(): Int = noticeList.size

    fun submitList(newList: List<Notice>) {
        noticeList = newList.toMutableList()
        notifyDataSetChanged()
    }
}
