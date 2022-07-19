
def pytest_addoption(parser):
    parser.addoption('--nsx_lb_config',
        action="store"
    )
    parser.addoption('--conv_excel',action="store")
    parser.addoption("--config",action="store")
    parser.addoption("--out", action="store")
    parser.addoption( '--avi_config_file',
                    help='absolute path for avi config file')

def pytest_configure(config):
    global option
    option=config.option
