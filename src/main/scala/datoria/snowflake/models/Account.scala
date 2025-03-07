/** merged spec
  * merged spec
  *
  * The version of the OpenAPI document: 1.0.0
  * Contact: team@openapitools.org
  *
  * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
  * https://openapi-generator.tech
  * Do not edit the class manually.
  */
package datoria.snowflake.models

import io.circe.*
import io.circe.syntax.*
import io.circe.{Decoder, Encoder}

import java.time.Instant

/** Snowflake account object.
  * @param organizationName Name of the organization.
  * @param name A Snowflake object identifier.
  * @param regionGroup Region group where the account is located. Note - This column is only displayed for organizations that span multiple region groups.
  * @param region Snowflake Region where the account is located. A Snowflake Region is a distinct location within a cloud platform region that is isolated from other Snowflake Regions. A Snowflake Region can be either multi-tenant or single-tenant (for a Virtual Private Snowflake account).
  * @param edition 
  * @param createdOn Date and time the account was created.
  * @param accountUrl Preferred Snowflake account URL that includes the values of organization_name and account_name.
  * @param accountLocator System-assigned identifier of the acccount.
  * @param accountLocatorUrl Legacy Snowflake account URL syntax that includes the region_name and account_locator.
  * @param managedAccounts Indicates how many managed accounts have been created by the account.
  * @param consumptionBillingEntityName Name of the consumption billing entity.
  * @param marketplaceConsumerBillingEntityName Name of the marketplace consumer billing entity.
  * @param marketplaceProviderBillingEntityName Name of the marketplace provider billing entity.
  * @param oldAccountUrl If the original account URL was saved when the account was renamed, provides the original URL. If the original account URL was dropped, the value is NULL even if the account was renamed
  * @param comment Optional comment in which to store information related to the account.
  * @param isOrgAdmin Indicates whether the ORGADMIN role is enabled in an account. If TRUE, the role is enabled.
  * @param retentionTime Number of days that historical data is retained for Time Travel.
  * @param droppedOn Date and time the account was dropped.
  * @param scheduledDeletionTime Date and time when the account is scheduled to be permanently deleted. Accounts are deleted within one hour after the scheduled time.
  * @param restoredOn Date and time when the account was last restored.
  * @param accountOldUrlSavedOn If the original account URL was saved when the account was renamed, provides the date and time when the original account URL was saved.
  * @param accountOldUrlLastUsed If the original account URL was saved when the account was renamed, indicates the last time the account was accessed using the original URL.
  * @param organizationOldUrl If the account’s organization was changed in a way that created a new account URL and the original account URL was saved, provides the original account URL. If the original account URL was dropped, the value is NULL even if the organization changed.
  * @param organizationOldUrlSavedOn If the account’s organization was changed in a way that created a new account URL and the original account URL was saved, provides the date and time when the original account URL was saved.
  * @param organizationOldUrlLastUsed If the account’s organization was changed in a way that created a new account URL and the original account URL was saved, indicates the last time the account was accessed using the original account URL.
  * @param organizationURLExpirationOn If the account’s organization was changed in a way that created a new account URL and the original account URL was saved, provides the date and time when the original account URL will be dropped. Dropped URLs cannot be used to access the account.
  * @param movedOn Date and time when the account was moved to a different organization.
  * @param isEventsAccount Indicates whether an account is an events account. For more information, see Set up logging and event sharing for an application.
  * @param movedToOrganization If the account was moved to a different organization, provides the name of that organization.
  * @param adminName Name of the account administrator.
  * @param adminPassword Password for the account administrator.
  * @param adminRsaPublicKey RSA public key for the account administrator.
  * @param adminUserType User type of the account administrator.
  * @param firstName First name of the account administrator.
  * @param lastName Last name of the account administrator.
  * @param email Email address of the account administrator.
  * @param mustChangePassword Indicates whether the account administrator must change the password at the next login.
  * @param polaris Indicates whether the account is a Polaris account.
  */
case class Account(
    organizationName: Option[String] = None,
    name: String,
    regionGroup: Option[String] = None,
    region: Option[String] = None,
    edition: AccountEdition,
    createdOn: Option[Instant] = None,
    accountUrl: Option[String] = None,
    accountLocator: Option[String] = None,
    accountLocatorUrl: Option[String] = None,
    managedAccounts: Option[Long] = None,
    consumptionBillingEntityName: Option[String] = None,
    marketplaceConsumerBillingEntityName: Option[String] = None,
    marketplaceProviderBillingEntityName: Option[String] = None,
    oldAccountUrl: Option[String] = None,
    comment: Option[String] = None,
    isOrgAdmin: Option[Boolean] = None,
    retentionTime: Option[Int] = None,
    droppedOn: Option[Instant] = None,
    scheduledDeletionTime: Option[Instant] = None,
    restoredOn: Option[Instant] = None,
    accountOldUrlSavedOn: Option[Instant] = None,
    accountOldUrlLastUsed: Option[Instant] = None,
    organizationOldUrl: Option[String] = None,
    organizationOldUrlSavedOn: Option[Instant] = None,
    organizationOldUrlLastUsed: Option[Instant] = None,
    organizationURLExpirationOn: Option[Instant] = None,
    movedOn: Option[Instant] = None,
    isEventsAccount: Option[Boolean] = None,
    movedToOrganization: Option[String] = None,
    adminName: String,
    adminPassword: Option[String] = None,
    adminRsaPublicKey: Option[String] = None,
    adminUserType: Option[String] = None,
    firstName: Option[String] = None,
    lastName: Option[String] = None,
    email: String,
    mustChangePassword: Option[Boolean] = None,
    polaris: Option[Boolean] = None
)
  
object Account {
  given encoderAccount: Encoder[Account] = Encoder.instance { t =>
    Json.fromFields{
      Seq(
        t.organizationName.map(v => "organization_name" -> v.asJson),
        Some("name" -> t.name.asJson),
        t.regionGroup.map(v => "region_group" -> v.asJson),
        t.region.map(v => "region" -> v.asJson),
        Some("edition" -> t.edition.asJson),
        t.createdOn.map(v => "created_on" -> v.asJson),
        t.accountUrl.map(v => "account_url" -> v.asJson),
        t.accountLocator.map(v => "account_locator" -> v.asJson),
        t.accountLocatorUrl.map(v => "account_locator_url" -> v.asJson),
        t.managedAccounts.map(v => "managed_accounts" -> v.asJson),
        t.consumptionBillingEntityName.map(v => "consumption_billing_entity_name" -> v.asJson),
        t.marketplaceConsumerBillingEntityName.map(v => "marketplace_consumer_billing_entity_name" -> v.asJson),
        t.marketplaceProviderBillingEntityName.map(v => "marketplace_provider_billing_entity_name" -> v.asJson),
        t.oldAccountUrl.map(v => "old_account_url" -> v.asJson),
        t.comment.map(v => "comment" -> v.asJson),
        t.isOrgAdmin.map(v => "is_org_admin" -> v.asJson),
        t.retentionTime.map(v => "retention_time" -> v.asJson),
        t.droppedOn.map(v => "dropped_on" -> v.asJson),
        t.scheduledDeletionTime.map(v => "scheduled_deletion_time" -> v.asJson),
        t.restoredOn.map(v => "restored_on" -> v.asJson),
        t.accountOldUrlSavedOn.map(v => "account_old_url_saved_on" -> v.asJson),
        t.accountOldUrlLastUsed.map(v => "account_old_url_last_used" -> v.asJson),
        t.organizationOldUrl.map(v => "organization_old_url" -> v.asJson),
        t.organizationOldUrlSavedOn.map(v => "organization_old_url_saved_on" -> v.asJson),
        t.organizationOldUrlLastUsed.map(v => "organization_old_url_last_used" -> v.asJson),
        t.organizationURLExpirationOn.map(v => "organization_URL_expiration_on" -> v.asJson),
        t.movedOn.map(v => "moved_on" -> v.asJson),
        t.isEventsAccount.map(v => "is_events_account" -> v.asJson),
        t.movedToOrganization.map(v => "moved_to_organization" -> v.asJson),
        Some("admin_name" -> t.adminName.asJson),
        t.adminPassword.map(v => "admin_password" -> v.asJson),
        t.adminRsaPublicKey.map(v => "admin_rsa_public_key" -> v.asJson),
        t.adminUserType.map(v => "admin_user_type" -> v.asJson),
        t.firstName.map(v => "first_name" -> v.asJson),
        t.lastName.map(v => "last_name" -> v.asJson),
        Some("email" -> t.email.asJson),
        t.mustChangePassword.map(v => "must_change_password" -> v.asJson),
        t.polaris.map(v => "polaris" -> v.asJson)
      ).flatten
    }
  }
  given decoderAccount: Decoder[Account] = Decoder.instance { c =>
    for {
      organizationName <- c.downField("organization_name").as[Option[String]]
      name <- c.downField("name").as[String]
      regionGroup <- c.downField("region_group").as[Option[String]]
      region <- c.downField("region").as[Option[String]]
      edition <- c.downField("edition").as[AccountEdition]
      createdOn <- c.downField("created_on").as[Option[Instant]]
      accountUrl <- c.downField("account_url").as[Option[String]]
      accountLocator <- c.downField("account_locator").as[Option[String]]
      accountLocatorUrl <- c.downField("account_locator_url").as[Option[String]]
      managedAccounts <- c.downField("managed_accounts").as[Option[Long]]
      consumptionBillingEntityName <- c.downField("consumption_billing_entity_name").as[Option[String]]
      marketplaceConsumerBillingEntityName <- c.downField("marketplace_consumer_billing_entity_name").as[Option[String]]
      marketplaceProviderBillingEntityName <- c.downField("marketplace_provider_billing_entity_name").as[Option[String]]
      oldAccountUrl <- c.downField("old_account_url").as[Option[String]]
      comment <- c.downField("comment").as[Option[String]]
      isOrgAdmin <- c.downField("is_org_admin").as[Option[Boolean]]
      retentionTime <- c.downField("retention_time").as[Option[Int]]
      droppedOn <- c.downField("dropped_on").as[Option[Instant]]
      scheduledDeletionTime <- c.downField("scheduled_deletion_time").as[Option[Instant]]
      restoredOn <- c.downField("restored_on").as[Option[Instant]]
      accountOldUrlSavedOn <- c.downField("account_old_url_saved_on").as[Option[Instant]]
      accountOldUrlLastUsed <- c.downField("account_old_url_last_used").as[Option[Instant]]
      organizationOldUrl <- c.downField("organization_old_url").as[Option[String]]
      organizationOldUrlSavedOn <- c.downField("organization_old_url_saved_on").as[Option[Instant]]
      organizationOldUrlLastUsed <- c.downField("organization_old_url_last_used").as[Option[Instant]]
      organizationURLExpirationOn <- c.downField("organization_URL_expiration_on").as[Option[Instant]]
      movedOn <- c.downField("moved_on").as[Option[Instant]]
      isEventsAccount <- c.downField("is_events_account").as[Option[Boolean]]
      movedToOrganization <- c.downField("moved_to_organization").as[Option[String]]
      adminName <- c.downField("admin_name").as[String]
      adminPassword <- c.downField("admin_password").as[Option[String]]
      adminRsaPublicKey <- c.downField("admin_rsa_public_key").as[Option[String]]
      adminUserType <- c.downField("admin_user_type").as[Option[String]]
      firstName <- c.downField("first_name").as[Option[String]]
      lastName <- c.downField("last_name").as[Option[String]]
      email <- c.downField("email").as[String]
      mustChangePassword <- c.downField("must_change_password").as[Option[Boolean]]
      polaris <- c.downField("polaris").as[Option[Boolean]]
    } yield Account(
      organizationName = organizationName,
      name = name,
      regionGroup = regionGroup,
      region = region,
      edition = edition,
      createdOn = createdOn,
      accountUrl = accountUrl,
      accountLocator = accountLocator,
      accountLocatorUrl = accountLocatorUrl,
      managedAccounts = managedAccounts,
      consumptionBillingEntityName = consumptionBillingEntityName,
      marketplaceConsumerBillingEntityName = marketplaceConsumerBillingEntityName,
      marketplaceProviderBillingEntityName = marketplaceProviderBillingEntityName,
      oldAccountUrl = oldAccountUrl,
      comment = comment,
      isOrgAdmin = isOrgAdmin,
      retentionTime = retentionTime,
      droppedOn = droppedOn,
      scheduledDeletionTime = scheduledDeletionTime,
      restoredOn = restoredOn,
      accountOldUrlSavedOn = accountOldUrlSavedOn,
      accountOldUrlLastUsed = accountOldUrlLastUsed,
      organizationOldUrl = organizationOldUrl,
      organizationOldUrlSavedOn = organizationOldUrlSavedOn,
      organizationOldUrlLastUsed = organizationOldUrlLastUsed,
      organizationURLExpirationOn = organizationURLExpirationOn,
      movedOn = movedOn,
      isEventsAccount = isEventsAccount,
      movedToOrganization = movedToOrganization,
      adminName = adminName,
      adminPassword = adminPassword,
      adminRsaPublicKey = adminRsaPublicKey,
      adminUserType = adminUserType,
      firstName = firstName,
      lastName = lastName,
      email = email,
      mustChangePassword = mustChangePassword,
      polaris = polaris
    )
  }
}

