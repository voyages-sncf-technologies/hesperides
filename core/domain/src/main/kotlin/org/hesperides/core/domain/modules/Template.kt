package org.hesperides.core.domain.modules

import org.axonframework.commandhandling.TargetAggregateIdentifier
import org.hesperides.core.domain.security.User
import org.hesperides.core.domain.security.UserEvent
import org.hesperides.core.domain.templatecontainers.entities.Template
import org.hesperides.core.domain.templatecontainers.entities.TemplateContainer

// Command
data class CreateTemplateCommand(@TargetAggregateIdentifier val id: String, val template: Template, val user: User)

data class UpdateTemplateCommand(@TargetAggregateIdentifier val id: String, val template: Template, val user: User)
data class DeleteTemplateCommand(@TargetAggregateIdentifier val id: String, val templateName: String, val user: User)

// Event
data class TemplateCreatedEvent(val id: String, val template: Template, override val user: User) : UserEvent(user)

data class TemplateUpdatedEvent(val id: String, val template: Template, override val user: User) : UserEvent(user)
data class TemplateDeletedEvent(val id: String, val templateName: String, override val user: User) : UserEvent(user)

// Query
data class GetTemplateByNameQuery(val moduleKey: TemplateContainer.Key, val templateName: String)
data class GetModuleTemplatesQuery(val moduleKey: TemplateContainer.Key)
