package com.kentoapps.ministagram.di.module

import android.arch.lifecycle.ViewModel
import com.kentoapps.ministagram.di.ViewModelKey
import com.kentoapps.ministagram.ui.comment.CommentFragment
import com.kentoapps.ministagram.ui.comment.CommentViewModel
import com.kentoapps.ministagram.ui.friends.FriendsFragment
import com.kentoapps.ministagram.ui.friends.FriendsViewModel
import com.kentoapps.ministagram.ui.post.PostFragment
import com.kentoapps.ministagram.ui.post.PostViewModel
import com.kentoapps.ministagram.ui.timeline.TimelineFragment
import com.kentoapps.ministagram.ui.timeline.TimelineViewModel
import com.kentoapps.ministagram.ui.user.UserFragment
import com.kentoapps.ministagram.ui.user.UserViewModel
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector
import dagger.multibindings.IntoMap

@Module
abstract class MainModule {

    @ContributesAndroidInjector
    abstract fun contributeTimelineFragment(): TimelineFragment

    @Binds
    @IntoMap
    @ViewModelKey(TimelineViewModel::class)
    abstract fun bindTimelineViewModel(viewModel: TimelineViewModel): ViewModel

    @ContributesAndroidInjector
    abstract fun contributeFriendsFragment(): FriendsFragment

    @Binds
    @IntoMap
    @ViewModelKey(FriendsViewModel::class)
    abstract fun bindSignUpViewModel(viewModel: FriendsViewModel): ViewModel

    @ContributesAndroidInjector
    abstract fun contributeUserFragment(): UserFragment

    @Binds
    @IntoMap
    @ViewModelKey(UserViewModel::class)
    abstract fun bindUserViewModel(viewModel: UserViewModel): ViewModel

    @ContributesAndroidInjector
    abstract fun contributePostFragment(): PostFragment

    @Binds
    @IntoMap
    @ViewModelKey(PostViewModel::class)
    abstract fun bindPostViewModel(viewModel: PostViewModel): ViewModel

    @ContributesAndroidInjector
    abstract fun contributeCommentFragment(): CommentFragment

    @Binds
    @IntoMap
    @ViewModelKey(CommentViewModel::class)
    abstract fun bindCommentViewModel(viewModel: CommentViewModel): ViewModel
}
