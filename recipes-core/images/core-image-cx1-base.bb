require recipes-core/images/core-image-minimal.bb

IMAGE_INSTALL += "\
                    openssh \
                    packagegroup-core-ssh-openssh \
                    github.com-influxdata-influxdb \
                 "
EXTRA_IMAGE_FEATURES += " empty-root-password \
                          debug-tweaks \
                        "               


inherit extrausers
EXTRA_USERS_PARAMS = "\
     useradd -g 'root' -p 'cx1' cx1; \
     usermod -s /bin/bash cx1; \
     usermod -P toor root; \
     "