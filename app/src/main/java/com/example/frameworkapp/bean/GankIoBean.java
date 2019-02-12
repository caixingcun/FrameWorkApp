package com.example.frameworkapp.bean;

import java.util.List;

public class GankIoBean {


    private List<AndroidBean> Android;
    private List<AppBean> App;
    private List<IOSBean> iOS;
    private List<休息视频Bean> 休息视频;
    private List<拓展资源Bean> 拓展资源;
    private List<瞎推荐Bean> 瞎推荐;
    private List<福利Bean> 福利;

    public List<AndroidBean> getAndroid() {
        return Android;
    }

    public void setAndroid(List<AndroidBean> Android) {
        this.Android = Android;
    }

    public List<AppBean> getApp() {
        return App;
    }

    public void setApp(List<AppBean> App) {
        this.App = App;
    }

    public List<IOSBean> getIOS() {
        return iOS;
    }

    public void setIOS(List<IOSBean> iOS) {
        this.iOS = iOS;
    }

    public List<休息视频Bean> get休息视频() {
        return 休息视频;
    }

    public void set休息视频(List<休息视频Bean> 休息视频) {
        this.休息视频 = 休息视频;
    }

    public List<拓展资源Bean> get拓展资源() {
        return 拓展资源;
    }

    public void set拓展资源(List<拓展资源Bean> 拓展资源) {
        this.拓展资源 = 拓展资源;
    }

    public List<瞎推荐Bean> get瞎推荐() {
        return 瞎推荐;
    }

    public void set瞎推荐(List<瞎推荐Bean> 瞎推荐) {
        this.瞎推荐 = 瞎推荐;
    }

    public List<福利Bean> get福利() {
        return 福利;
    }

    public void set福利(List<福利Bean> 福利) {
        this.福利 = 福利;
    }

    public static class AndroidBean {
        /**
         * _id : 5c2df1479d2122759a04b597
         * createdAt : 2019-01-03T11:25:59.115Z
         * desc : Android 一键加入侧滑返回 (类似“小米MIX”和新版“即刻”滑动返回)
         * images : ["https://ww1.sinaimg.cn/large/0073sXn7ly1fze96rdfhmg308w0ft7wh","https://ww1.sinaimg.cn/large/0073sXn7ly1fze96s6tdag308w0ftjvw"]
         * publishedAt : 2019-01-21T00:00:00.0Z
         * source : web
         * type : Android
         * url : https://github.com/qinci/AndroidSlideBack
         * used : true
         * who : qinci
         */

        private String _id;
        private String createdAt;
        private String desc;
        private String publishedAt;
        private String source;
        private String type;
        private String url;
        private boolean used;
        private String who;
        private List<String> images;

        public String get_id() {
            return _id;
        }

        public void set_id(String _id) {
            this._id = _id;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public String getPublishedAt() {
            return publishedAt;
        }

        public void setPublishedAt(String publishedAt) {
            this.publishedAt = publishedAt;
        }

        public String getSource() {
            return source;
        }

        public void setSource(String source) {
            this.source = source;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public boolean isUsed() {
            return used;
        }

        public void setUsed(boolean used) {
            this.used = used;
        }

        public String getWho() {
            return who;
        }

        public void setWho(String who) {
            this.who = who;
        }

        public List<String> getImages() {
            return images;
        }

        public void setImages(List<String> images) {
            this.images = images;
        }
    }

    public static class AppBean {
        /**
         * _id : 5c31d8a79d21222bd38ce73e
         * createdAt : 2019-01-06T10:29:59.746Z
         * desc : flutter开发的干货集中营客户端
         * publishedAt : 2019-01-25T13:02:10.57Z
         * source : web
         * type : App
         * url : https://github.com/fujianlian/GankFlutter
         * used : true
         * who : lijinshanmx
         * images : ["https://ww1.sinaimg.cn/large/0073sXn7ly1fze9706gdzj30ae0kqmyw","https://ww1.sinaimg.cn/large/0073sXn7ly1fze970ocgxj30ae0ks0tc","https://ww1.sinaimg.cn/large/0073sXn7ly1fze97124aej30af0kq404"]
         */

        private String _id;
        private String createdAt;
        private String desc;
        private String publishedAt;
        private String source;
        private String type;
        private String url;
        private boolean used;
        private String who;
        private List<String> images;

        public String get_id() {
            return _id;
        }

        public void set_id(String _id) {
            this._id = _id;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public String getPublishedAt() {
            return publishedAt;
        }

        public void setPublishedAt(String publishedAt) {
            this.publishedAt = publishedAt;
        }

        public String getSource() {
            return source;
        }

        public void setSource(String source) {
            this.source = source;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public boolean isUsed() {
            return used;
        }

        public void setUsed(boolean used) {
            this.used = used;
        }

        public String getWho() {
            return who;
        }

        public void setWho(String who) {
            this.who = who;
        }

        public List<String> getImages() {
            return images;
        }

        public void setImages(List<String> images) {
            this.images = images;
        }
    }

    public static class IOSBean {
        /**
         * _id : 5c403e919d212264d4501d30
         * createdAt : 2019-01-17T08:36:33.526Z
         * desc : 一个完善的iOS UI敏捷开发框架，基于UIKit，包含常用控件的链式API拓展、一个数据驱动的列表框架、一个事件处理队列。
         * images : ["https://ww1.sinaimg.cn/large/0073sXn7ly1fze97l9tq7g30ad0ih1ky","https://ww1.sinaimg.cn/large/0073sXn7ly1fze97p50emg30ad0ihkjl"]
         * publishedAt : 2019-01-21T00:00:00.0Z
         * source : chrome
         * type : iOS
         * url : https://github.com/tbl00c/ZZFLEX
         * used : true
         * who : 夜尽天明
         */

        private String _id;
        private String createdAt;
        private String desc;
        private String publishedAt;
        private String source;
        private String type;
        private String url;
        private boolean used;
        private String who;
        private List<String> images;

        public String get_id() {
            return _id;
        }

        public void set_id(String _id) {
            this._id = _id;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public String getPublishedAt() {
            return publishedAt;
        }

        public void setPublishedAt(String publishedAt) {
            this.publishedAt = publishedAt;
        }

        public String getSource() {
            return source;
        }

        public void setSource(String source) {
            this.source = source;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public boolean isUsed() {
            return used;
        }

        public void setUsed(boolean used) {
            this.used = used;
        }

        public String getWho() {
            return who;
        }

        public void setWho(String who) {
            this.who = who;
        }

        public List<String> getImages() {
            return images;
        }

        public void setImages(List<String> images) {
            this.images = images;
        }
    }

    public static class 休息视频Bean {
        /**
         * _id : 5c4578ae9d212264ce006f4b
         * createdAt : 2019-01-21T07:45:50.59Z
         * desc : #大早上的你是想笑死我吗
         * publishedAt : 2019-01-21T00:00:00.0Z
         * source : web
         * type : 休息视频
         * url : https://v.douyin.com/NwdsVy/
         * used : true
         * who : lijinshanmx
         */

        private String _id;
        private String createdAt;
        private String desc;
        private String publishedAt;
        private String source;
        private String type;
        private String url;
        private boolean used;
        private String who;

        public String get_id() {
            return _id;
        }

        public void set_id(String _id) {
            this._id = _id;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public String getPublishedAt() {
            return publishedAt;
        }

        public void setPublishedAt(String publishedAt) {
            this.publishedAt = publishedAt;
        }

        public String getSource() {
            return source;
        }

        public void setSource(String source) {
            this.source = source;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public boolean isUsed() {
            return used;
        }

        public void setUsed(boolean used) {
            this.used = used;
        }

        public String getWho() {
            return who;
        }

        public void setWho(String who) {
            this.who = who;
        }
    }

    public static class 拓展资源Bean {
        /**
         * _id : 5a5570d8421aa9115b930657
         * createdAt : 2018-01-10T09:48:08.708Z
         * desc : 用Python爬取各Android市场应用下载量（3分钟学会）
         * publishedAt : 2019-01-21T00:00:00.0Z
         * source : web
         * type : 拓展资源
         * url : https://mp.weixin.qq.com/s?__biz=MzIwMzYwMTk1NA==&mid=2247489179&idx=1&sn=4b99a633b1f4fc1804782c6e85faa5bf
         * used : true
         * who : 陈宇明
         */

        private String _id;
        private String createdAt;
        private String desc;
        private String publishedAt;
        private String source;
        private String type;
        private String url;
        private boolean used;
        private String who;

        public String get_id() {
            return _id;
        }

        public void set_id(String _id) {
            this._id = _id;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public String getPublishedAt() {
            return publishedAt;
        }

        public void setPublishedAt(String publishedAt) {
            this.publishedAt = publishedAt;
        }

        public String getSource() {
            return source;
        }

        public void setSource(String source) {
            this.source = source;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public boolean isUsed() {
            return used;
        }

        public void setUsed(boolean used) {
            this.used = used;
        }

        public String getWho() {
            return who;
        }

        public void setWho(String who) {
            this.who = who;
        }
    }

    public static class 瞎推荐Bean {
        /**
         * _id : 5a614fc6421aa9115b930678
         * createdAt : 2019-01-21T07:51:14.120Z
         * desc : 12款堪称神器的 Chrome 插件
         * publishedAt : 2019-01-21T00:00:00.0Z
         * source : web
         * type : 瞎推荐
         * url : https://mp.weixin.qq.com/s?__biz=MzIwMzYwMTk1NA==&mid=2247489341&idx=2&sn=f4c9ed88bbd724018e39e42fa1dc0fca
         * used : true
         * who : 陈宇明
         * images : ["https://ww1.sinaimg.cn/large/0073sXn7ly1fze96x48bng30mw09y7b0","https://ww1.sinaimg.cn/large/0073sXn7ly1fze96ziljwg31dc0l8qu2"]
         */

        private String _id;
        private String createdAt;
        private String desc;
        private String publishedAt;
        private String source;
        private String type;
        private String url;
        private boolean used;
        private String who;
        private List<String> images;

        public String get_id() {
            return _id;
        }

        public void set_id(String _id) {
            this._id = _id;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public String getPublishedAt() {
            return publishedAt;
        }

        public void setPublishedAt(String publishedAt) {
            this.publishedAt = publishedAt;
        }

        public String getSource() {
            return source;
        }

        public void setSource(String source) {
            this.source = source;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public boolean isUsed() {
            return used;
        }

        public void setUsed(boolean used) {
            this.used = used;
        }

        public String getWho() {
            return who;
        }

        public void setWho(String who) {
            this.who = who;
        }

        public List<String> getImages() {
            return images;
        }

        public void setImages(List<String> images) {
            this.images = images;
        }
    }

    public static class 福利Bean {
        /**
         * _id : 5c4578db9d212264d4501d40
         * createdAt : 2019-01-21T07:46:35.304Z
         * desc : 2019-01-21
         * publishedAt : 2019-01-21T00:00:00.0Z
         * source : web
         * type : 福利
         * url : https://ws1.sinaimg.cn/large/0065oQSqgy1fze94uew3jj30qo10cdka.jpg
         * used : true
         * who : lijinshanmx
         */

        private String _id;
        private String createdAt;
        private String desc;
        private String publishedAt;
        private String source;
        private String type;
        private String url;
        private boolean used;
        private String who;

        public String get_id() {
            return _id;
        }

        public void set_id(String _id) {
            this._id = _id;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public String getPublishedAt() {
            return publishedAt;
        }

        public void setPublishedAt(String publishedAt) {
            this.publishedAt = publishedAt;
        }

        public String getSource() {
            return source;
        }

        public void setSource(String source) {
            this.source = source;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public boolean isUsed() {
            return used;
        }

        public void setUsed(boolean used) {
            this.used = used;
        }

        public String getWho() {
            return who;
        }

        public void setWho(String who) {
            this.who = who;
        }
    }
}
