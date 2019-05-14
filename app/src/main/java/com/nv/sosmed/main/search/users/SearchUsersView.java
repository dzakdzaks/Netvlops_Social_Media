package com.nv.sosmed.main.search.users;

import com.nv.sosmed.main.base.BaseFragmentView;
import com.nv.sosmed.model.Profile;

import java.util.List;

/**
 * Created by Alexey on 08.06.18.
 */
public interface SearchUsersView extends BaseFragmentView {
    void onSearchResultsReady(List<Profile> profiles);

    void showLocalProgress();

    void hideLocalProgress();

    void showEmptyListLayout();

    void updateSelectedItem();
}
