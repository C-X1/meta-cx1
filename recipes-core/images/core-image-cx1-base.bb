require recipes-core/images/core-image-minimal.bb

IMAGE_INSTALL += "\
                    openssh \
                    packagegroup-core-ssh-openssh \
                    github.com-influxdata-influxdb \
                    github.com-influxdata-telegraf \
                    grafana-go \
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
     
     
KERNEL_DEVICETREE = " \
bcm2708-rpi-b.dtb \
bcm2708-rpi-b-plus.dtb \
bcm2709-rpi-2-b.dtb \
bcm2710-rpi-3-b.dtb \
"