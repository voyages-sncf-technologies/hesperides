/*
 *
 * This file is part of the Hesperides distribution.
 * (https://github.com/voyages-sncf-technologies/hesperides)
 * Copyright (c) 2016 VSCT.
 *
 * Hesperides is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, version 3.
 *
 * Hesperides is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 *
 *
 */
package org.hesperides.core.presentation.io.platforms;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.hesperides.core.domain.platforms.queries.views.ApplicationView;
import org.hesperides.core.domain.security.queries.views.ApplicationDirectoryGroupsView;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Value
@AllArgsConstructor
public class ApplicationOutput {

    String name;
    List<PlatformIO> platforms;
    Map<String, List<String>> directoryGroups;

    public ApplicationOutput(ApplicationView applicationView) {
        this.name = applicationView.getName();
        this.platforms = PlatformIO.fromPlatformViews(applicationView.getPlatforms());
        this.directoryGroups = Optional.ofNullable(applicationView.getDirectoryGroups())
                .map(ApplicationDirectoryGroupsView::getDirectoryGroupCNs)
                .orElse(Collections.emptyMap());
    }
}
