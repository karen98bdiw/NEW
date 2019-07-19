package com.example.anew

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.example.anew.RealTimeNewsParser.Results
import kotlinx.android.synthetic.main.articles_recycler_item.view.*

class ArticlesRecyclerViewAdapter(data:List<com.example.anew.RealTimeNewsParser.Results>,context:Context) : RecyclerView.Adapter<ArticlesRecyclerViewAdapter.ViewHolder>() {

    lateinit var data:List<Results>
    lateinit var context: Context

    init {
        this.data = data
        this.context = context
    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {

        val inflater = LayoutInflater.from(p0.context)
        val view = inflater.inflate(R.layout.articles_recycler_item,p0,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return data.size
    }


    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
        Log.e("newsRecycler",data.get(p1).title)

        val curentArticle = data.get(p1)

        p0.articleTitleView.setText(curentArticle.title)
        p0.articleAbstractView.setText(curentArticle.abstract)
        Glide
            .with(p0.articleImageView.context)
            .load(curentArticle.multimedia.get(0).url)
            .into(p0.articleImageView)

    }


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val articleTitleView = itemView.articleTittleView
        val articleImageView = itemView.articleImageView
        val articleAbstractView = itemView.articleAbstractView

    }
}