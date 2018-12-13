package in.apps.adhil.mvvmapp.di;

import dagger.Subcomponent;
import in.apps.adhil.mvvmapp.viewmodel.ProjectListViewModel;
import in.apps.adhil.mvvmapp.viewmodel.ProjectViewModel;

/**
 * A sub component to create ViewModels. It is called by the
 * {@link in.apps.adhil.mvvmapp.viewmodel.ProjectViewModelFactory}.
 */
@Subcomponent
public interface ViewModelSubComponent {
    @Subcomponent.Builder
    interface Builder {
        ViewModelSubComponent build();
    }

    ProjectListViewModel projectListViewModel();
    ProjectViewModel projectViewModel();
}
