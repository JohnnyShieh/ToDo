package com.example.android.architecture.blueprints.todoapp.di.component;

import com.example.android.architecture.blueprints.todoapp.addedittask.AddEditTaskActivity;
import com.example.android.architecture.blueprints.todoapp.addedittask.AddEditTaskContract;
import com.example.android.architecture.blueprints.todoapp.di.ActivityScope;
import com.example.android.architecture.blueprints.todoapp.di.module.AddEditTaskPresenterModule;

import dagger.BindsInstance;
import dagger.Subcomponent;

/**
 * Created by johnny on 2017/6/8.
 */
@ActivityScope
@Subcomponent(modules = AddEditTaskPresenterModule.class)
public interface AddEditTaskComponent {

    void inject(AddEditTaskActivity activity);

    @Subcomponent.Builder
    interface Builder {
        @BindsInstance
        Builder taskId(@Nullable String taskId);

        @BindsInstance
        Builder view(AddEditTaskContract.View view);

        @BindsInstance
        Builder dataMissing(boolean isDataMissing);

        AddEditTaskComponent build();
    }
}
