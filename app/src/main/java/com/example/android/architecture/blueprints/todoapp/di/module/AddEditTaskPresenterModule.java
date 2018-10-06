package com.example.android.architecture.blueprints.todoapp.di.module;
import android.support.annotation.Nullable;
import com.example.android.architecture.blueprints.todoapp.addedittask.AddEditTaskContract;
import com.example.android.architecture.blueprints.todoapp.addedittask.AddEditTaskPresenter;
import com.example.android.architecture.blueprints.todoapp.data.source.TasksRepository;
import com.example.android.architecture.blueprints.todoapp.di.ActivityScope;

import dagger.Module;
import dagger.Provides;

/**
 * Created by johnny on 2017/6/8.
 */
@Module
public class AddEditTaskPresenterModule {

    @Provides
    @ActivityScope
    AddEditTaskPresenter provideAddEditTaskPresenter(TasksRepository tasksRepository, @Nullable String taskId,
        AddEditTaskContract.View view, boolean isDataMissing) {
        return new AddEditTaskPresenter(taskId, tasksRepository, view, isDataMissing);
    }
}
